/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceorm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AN515-43
 */
public class InheritanceORM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FulltimeEmployee emp1 = new FulltimeEmployee();
        emp1.setName("John");
        emp1.setSalary(5000);
        ParttimeEmployee emp2 = new ParttimeEmployee();
        emp2.setName("Jane");
        emp2.setHoursWork(4);
        WorkTableFulltime.insertFulltimeEmployee(emp1);
        WorkTablePartTime.insertPartTimeEmployee(emp2);
        
        //FulltimeEmployee remove = new FulltimeEmployee();
        //remove.setId((long)1);
        //WorkTableFulltime.removeFulltimeEmployee(remove);
        
        //ParttimeEmployee update = new ParttimeEmployee();
        //update.setId((long)2);
        //update.setName("Mu");
        //update.setHoursWork(6000);
        //WorkTablePartTime.updateParttimeEmployee(update);
    }
}
