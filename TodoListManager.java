/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import javax.swing.*;
import java.util.*;

public class TodoListManager {

    static LinkedList<String> todo = new LinkedList<>(), done = new LinkedList<>();
    static Stack<String> undoStack = new Stack<>();

    public static void main(String[] args) {
        while (true) {
            String choice = JOptionPane.showInputDialog(null,"Please enter the number of operations below:\n\n" + "1. Add Task\n2. Mark Task as Done\n3. Undo\n4. View To-Do List\n5. View Completed Tasks\n6. Exit\n\n", "TodoList Manager", JOptionPane.PLAIN_MESSAGE);
            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    markDone();
                    break;
                case "3":
                    undo();
                    break;
                case "4":
                    viewList(todo, "To-Do List");
                    break;
                case "5":
                    viewList(done, "Completed Tasks");
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    return;
                    default:
                    JOptionPane.showMessageDialog(null, "Operation not found in the list.");
            }
        }
    }

    static void addTask() {
        String task = JOptionPane.showInputDialog("Enter task:");
        if (task != null) {
            todo.add(task);
            undoStack.push("add:" + task);
            JOptionPane.showMessageDialog(null, "Task Successfully Added.", "Task: " + task, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static void markDone() {
        if (todo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tasks to mark as done.", "List Status: Empty", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String task = todo.remove(Integer.parseInt(JOptionPane.showInputDialog(null, "Select task number to mark as done:\n" + getTaskList(todo))) - 1);
        done.add(task + " ✔");
        undoStack.push("done:" + task);
        JOptionPane.showMessageDialog(null, "Marked as done.", "Task: " + task, JOptionPane.INFORMATION_MESSAGE);

    }

    static void undo() {
        if (done.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No completed tasks to undo.", "List Status: Empty", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String task = done.removeLast().replace(" ✔", "");
        todo.add(task);
        JOptionPane.showMessageDialog(null, "The recently completed task has been restored.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    static void viewList(LinkedList<String> list, String title) {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nothing to see here.", "List Status: Empty", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, title + ":\n" + getTaskList(list));
        }
    }

    static String getTaskList(LinkedList<String> list) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            output.append((i + 1) + ". " + list.get(i) + "\n");
        }
        return output.toString();
    }
}