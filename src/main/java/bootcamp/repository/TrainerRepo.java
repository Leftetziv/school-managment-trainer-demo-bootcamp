/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp.repository;

import bootcamp.entity.Trainer;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leyteris
 */
@Repository
public class TrainerRepo extends HibernateUtil<Trainer>{

    
    public List<Trainer> findAll() {
        return super.findAll("Trainer.findAll");
    }
    
    @Override
    public Trainer save(Trainer trainer) {
        return super.save(trainer);
    } 
    
    public Trainer find(int id) {
        return super.find(Trainer.class, id);
    }       
    
}
