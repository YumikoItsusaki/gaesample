package jp.itacademy.gae_sample.controller.ds;

import java.util.ArrayList;
import java.util.List;

import jp.itacademy.gae_sample.model.Credential;
import jp.itacademy.gae_sample.model.Dept;
import jp.itacademy.gae_sample.model.Employee;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

public class CreateSampleController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        Employee employee;
        Dept dept;
        Credential credential;
        List<Object> models = new ArrayList<Object>();
        
        credential = new Credential();
        credential.setKey(Datastore.createKey(Credential.class, 1));
        credential.setName("•’Ê–Æ‹–");
        models.add(credential);
        
        credential = new Credential();
        credential.setKey(Datastore.createKey(Credential.class, 2));
        credential.setName("Šî–{î•ñ‹ZpÒ");
        models.add(credential);
        
        credential = new Credential();
        credential.setKey(Datastore.createKey(Credential.class, 3));
        credential.setName("ƒ^ƒRŒŸ’è");
        models.add(credential);
        
        
        
        return forward("createSample.jsp");
    }
}
