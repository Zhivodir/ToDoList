package org.dzhivchik.todolist.service.impl;

import org.dzhivchik.todolist.dao.TodoListDAO;
import org.dzhivchik.todolist.entity.TodoItem;
import org.dzhivchik.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by 1 on 22.05.2016.
 */
@Service
@Transactional(readOnly = false)
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    TodoListDAO todoItemDAO;

    @Override
    public void addTodoItem(TodoItem todoItem) {
        todoItemDAO.addTodoItem(todoItem);
    }

    @Override
    public void updateTodoItem(TodoItem todoItem) {
        todoItemDAO.updateTodoItem(todoItem);
    }

    @Override
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public List<TodoItem> getAllTodoItems() {
        return todoItemDAO.getAllTodoItems();
    }

    @Override
    public void deleteTodoItem(int id) {
        todoItemDAO.deleteTodoItem(id);
    }
}
