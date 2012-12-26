package jp.itacademy.gae_sample.controller.ds.employee;

import jp.itacademy.gae_sample.model.Employee;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Validators;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

public class UpdateSalaryController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        Validators v = new Validators(request);
        v.add("id", v.longType());
        v.add("salary", v.required(), v.integerType());
        if (!v.validate()) {
            System.out.println("validation error: " + errors);
            return null;
        }
        
        long id = asLong("id");
        int salary = asInteger("salary");
        
        Key key = Datastore.createKey(Employee.class, id);
        
        
        
        Employee e = Datastore.get(Employee.class, key);
        e.setSalary(salary);
        Datastore.put(e);
        
        return forward("updateSalary.jsp");
    }
}
