package main.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private TestRepo testRepo;


    @Autowired
    public UserController(TestRepo testRepo){
        this.testRepo = testRepo;
    }

    @GetMapping
    @ResponseBody
    public Iterable<TestEntity> getUsers(){
        return testRepo.findAll();
    }
}
