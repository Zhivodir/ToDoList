package org.dzhivchik.todolist.service;

import org.dzhivchik.todolist.entity.TodoItem;
import java.util.List;

/**
 * Created by 1 on 22.05.2016.
 */

public interface TodoListService {
    public void addTodoItem(TodoItem todoItem);
    public void updateTodoItem(TodoItem todoItem);
    public List getAllTodoItems();
    public void deleteTodoItem(int id);
}
