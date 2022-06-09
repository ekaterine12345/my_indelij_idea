package beans;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import  javax.persistence.Query;
import javax.persistence.Persistence;


public class DB {

    public DB() {
        System.out.println("DB");
    }


    public boolean saveUser(AppUsers appUser) {

        if (appUser.getId() ==0 || appUser.getLastname() == null || appUser.getName() == null ||
            appUser.getEmail() == null || appUser.getPhoneNumber() == null) {
            return false;
        }




        try {
            EntityManagerFactory factory= Persistence.createEntityManagerFactory("test_jdbc");
            EntityManager entityManager=factory.createEntityManager();
            entityManager.getTransaction().begin();

            Query query=entityManager.createNativeQuery("insert into users_app2(id,name,lastname,email,phoneNumber) values (?,?,?,?,?)");

            query.setParameter(1,appUser.getId());
            query.setParameter(2,appUser.getName());
            query.setParameter(3,appUser.getLastname());
            query.setParameter(4,appUser.getEmail());
            query.setParameter(5,appUser.getPhoneNumber());
            query.executeUpdate();

            entityManager.getTransaction().commit();

        } catch (EntityExistsException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }



    public boolean deleteUser(AppUsers appUser) {

        try {

            EntityManagerFactory factory= Persistence.createEntityManagerFactory("test_jdbc");
            EntityManager entityManager=factory.createEntityManager();
            entityManager.getTransaction().begin();


            Query query=entityManager.createQuery("delete  from AppUsers where id=?1");
            query.setParameter(1,appUser.getId());
            query.executeUpdate();

            entityManager.getTransaction().commit();



        } catch (EntityExistsException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean updateUser(AppUsers appUser) {


        appUser.setId(Math.abs(appUser.getId()));
        try {
            EntityManagerFactory factory= Persistence.createEntityManagerFactory("test_jdbc");
            EntityManager entityManager=factory.createEntityManager();
            entityManager.getTransaction().begin();

            Query query=entityManager.createQuery("update AppUsers set name=?1, lastname=?2, email=?3, phoneNumber=?4 where id=?5");
            query.setParameter(1,appUser.getName());
            query.setParameter(2,appUser.getLastname());
            query.setParameter(3,appUser.getEmail());
            query.setParameter(4,appUser.getPhoneNumber());
            query.setParameter(5,appUser.getId());

            query.executeUpdate();

            entityManager.getTransaction().commit();


        } catch (EntityExistsException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }



    public List<AppUsers> getAllRecods() {
        List<AppUsers> appUsersList = new ArrayList<AppUsers>();

        try {
            EntityManagerFactory factory= Persistence.createEntityManagerFactory("test_jdbc");
            EntityManager entityManager=factory.createEntityManager();


            Query query =entityManager.createQuery("from AppUsers ap");

            appUsersList=query.getResultList();

        } catch (EntityExistsException e) {
            e.printStackTrace();
        }


        return appUsersList;
    }

    public AppUsers getRecordById(int id) {


        try {
            EntityManagerFactory factory= Persistence.createEntityManagerFactory("test_jdbc");
            EntityManager entityManager=factory.createEntityManager();
            entityManager.getTransaction().begin();



            Query query=entityManager.createQuery("from AppUsers where id=?1");
            query.setParameter(1,id);


         AppUsers appUsers= (AppUsers) query.getSingleResult();

            System.out.println("appUsers "+appUsers);
            entityManager.getTransaction().commit();
            return appUsers;


        } catch (EntityExistsException e) {
            e.printStackTrace();
        }


        return null;

    }

}
