package musicapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author zoheb
 */
public interface StackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Song song);
    public Song pop();
    public int size();
    public void emptyStack();
    public String displayStack();
}
