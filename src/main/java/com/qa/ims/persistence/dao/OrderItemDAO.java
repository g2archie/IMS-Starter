package com.qa.ims.persistence.dao;

import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.DBUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderItemDAO implements Dao<OrderItems> {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public OrderItems modelFromResultSet(ResultSet resultSet) throws SQLException {
        Long orderItemId = resultSet.getLong("ord_it_id");
        Integer amount = resultSet.getInt("amount");
        Long orderId = resultSet.getLong("order_id");
        Long itemId = resultSet.getLong("item_id");

        return new OrderItems(orderItemId, amount, orderId, itemId);
    }

    @Override
    public List<OrderItems> readAll() {
        try (Connection connection = DBUtils.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM orderitems");) {
            List<OrderItems> orderItems = new ArrayList<>();
            while (resultSet.next()) {
                orderItems.add(modelFromResultSet(resultSet));
            }
            return orderItems ;
        } catch (SQLException e) {
            LOGGER.debug(e);
            LOGGER.error(e.getMessage());
        }
        return new ArrayList<>();
    }

    private OrderItems readLatest() {
        try (Connection connection = DBUtils.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM orderItems ORDER BY id DESC LIMIT 1");) {
            resultSet.next();
            return modelFromResultSet(resultSet);
        } catch (Exception e) {
            LOGGER.debug(e);
            LOGGER.error(e.getMessage());
        }
        return null;
    }
    @Override
    public OrderItems create(OrderItems orderItems) {
        try (Connection connection = DBUtils.getInstance().getConnection();
             PreparedStatement statement = connection
                     .prepareStatement("INSERT INTO orders(ord_it_id, amount, order_id , item_id) VALUES (?, ?, ?, ?)");) {
            statement.setLong(1, orderItems.getOrderItemId());
            statement.setInt(2, orderItems.getAmount());
            statement.setLong(3, orderItems.getOrderId());
            statement.setLong(4, orderItems.getItemId());

            statement.executeUpdate();
            return readLatest();
        } catch (Exception e) {
            LOGGER.debug(e);
            LOGGER.error(e.getMessage());
        }
        return null;
    }

    @Override
    public OrderItems read(Long id) {
        return null;
    }

    @Override
    public OrderItems update(OrderItems orderItems) {
        return null;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

}
