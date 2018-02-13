/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import command.EmptyCommand;
import command.creator.CreatorClassEnum;
import interfaces.ActionCommand;

/**
 *
 * @author pupil
 */
public class ActionFactory {
    public ActionCommand defineCommand(String command){
        if(command == null || command.isEmpty()){
             return new EmptyCommand();
        }else{
            CreatorClassEnum creatorClassEnum = CreatorClassEnum.valueOf(command.toUpperCase());
            
            ActionCommand actionCommand = creatorClassEnum.getActionCommand();
            if(actionCommand == null) {
                return new EmptyCommand();
            }
            else {
                return actionCommand;
            }
        }
       
    }
    
}
    
