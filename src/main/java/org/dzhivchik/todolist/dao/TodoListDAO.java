package org.dzhivchik.todolist.dao;

import org.dzhivchik.todolist.entity.TodoItem;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 1 on 17.05.2016.
 */
public interface TodoListDAO {
    public void addTodoItem(TodoItem todoItem);
    public void updateTodoItem(TodoItem todoItem);
    public List getAllTodoItems();
    public void deleteTodoItem(int id);
}
