package org.dzhivchik.todolist.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.dzhivchik.todolist.dao.TodoListDAO;
import org.dzhivchik.todolist.entity.TodoItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 1 on 17.05.2016.
 */
@Repository
public class TodoListDAOImpl implements TodoListDAO {

    private static final Logger logger = LoggerFactory.getLogger(TodoListDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addTodoItem(TodoItem todoItem) {
        logger.info("Add TodoItem");
        sessionFactory.getCurrentSession().save(todoItem);
    }

    @Override
    public void updateTodoItem(TodoItem todoItem) {
        logger.info("Update TodoItem");
        sessionFactory.getCurrentSession().update(todoItem);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<TodoItem> getAllTodoItems() {
        logger.info("Get TodoList");
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TodoItem.class);
        return criteria.list();
    }

    @Override
    public void deleteTodoItem(int id) {
        logger.info("Delete TodoItem");
        TodoItem todoItem = new TodoItem(id);
        sessionFactory.getCurrentSession().delete(todoItem);
    }
}
