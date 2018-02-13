/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.creator;

import command.AddWordCommand;
import command.EmptyCommand;
import command.LoginCommand;
import command.MemoWordsCommand;
import command.RegistrationCommand;
import interfaces.ActionCommand;

/**
 *
 * @author pupil
 */
public enum CreatorClassEnum {
     EMPTY{{this.command = new EmptyCommand();}},
     LOGIN{{this.command = new LoginCommand();}},
     ADDWORD{{this.command = new AddWordCommand();}},   
     WORDS{{this.command = new MemoWordsCommand();}},
     REGISTRATION{{this.command = new RegistrationCommand();}},
;

    ActionCommand command;
    public ActionCommand getActionCommand() {
        return this.command;
    }    
}
