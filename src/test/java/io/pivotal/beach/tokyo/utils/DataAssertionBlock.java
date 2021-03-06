package io.pivotal.beach.tokyo.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface DataAssertionBlock {
    void examine(ResultSet ts) throws SQLException;
}
