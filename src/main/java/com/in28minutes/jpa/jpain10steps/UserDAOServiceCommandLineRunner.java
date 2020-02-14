package com.in28minutes.jpa.jpain10steps;

import com.in28minutes.jpa.jpain10steps.entity.User;
import com.in28minutes.jpa.jpain10steps.service.UserDAOService;
import com.in28minutes.jpa.jpain10steps.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//import java.util.logging.Logger;

@Component
public class UserDAOServiceCommandLineRunner
implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Autowired
    private UserRepository userRepository;

//    @Override
//    public void run(String... args) throws Exception {
//        //Save user
//
//        User user = new User( "Jill", "Test");
//        long insert = userDAOService.insert(user);
//        logger.info("New user is created : "+user);
//    }

        @Override
    public void run(String... args) throws Exception {
        //Save user

        User user = new User( "Jill", "Test");
        //long insert = userDAOService.insert(user);
            userRepository.save(user);

            Optional<User> userWithIdOne = userRepository.findById(1l);
            logger.info("New user is created : "+userWithIdOne);

        logger.info("New user is created : "+userWithIdOne);

        List<User> users = userRepository.findAll();

        logger.info("All Users : "+users);
    }

}
