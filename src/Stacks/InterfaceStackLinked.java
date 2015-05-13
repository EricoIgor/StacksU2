/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author Erick Igor
 */
public interface InterfaceStackLinked {

    void stackCreate(int lenght);

    boolean empty();

    boolean full();

    int lenght();

    No push(int value);

    No pop();

    int getTop();
    
    void list();
}
