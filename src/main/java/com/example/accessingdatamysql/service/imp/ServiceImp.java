package com.example.accessingdatamysql.service.imp;

import com.example.accessingdatamysql.entity.UserTable;
import com.example.accessingdatamysql.service.Service;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ServiceImp implements Service {

    public ServiceImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<UserTable> getAllUsers() {
//        String sql = "INSERT INTO"

            Session session = entityManager.unwrap(Session.class);
            Query<UserTable> query = session.createQuery("FROM employees",UserTable.class);
            List<UserTable> all = query.getResultList();

            System.out.println(all);


            return all;

    }
}
