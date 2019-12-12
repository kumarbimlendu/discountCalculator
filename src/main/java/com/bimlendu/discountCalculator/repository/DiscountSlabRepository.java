package com.bimlendu.discountCalculator.repository;

import com.bimlendu.discountCalculator.model.DiscountSlab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DiscountSlabRepository {

        @Autowired
        JdbcTemplate jdbcTemplate;

        public List< DiscountSlab > findAll() {
                return jdbcTemplate.query("select * from discount_slab", new DiscountSlabRowMapper());
        }
}

class DiscountSlabRowMapper implements RowMapper<DiscountSlab> {
        @Override
        public DiscountSlab mapRow(ResultSet rs, int rowNum) throws SQLException {
                DiscountSlab aDiscountSlab = new DiscountSlab();
                aDiscountSlab.setId(rs.getString("id"));
                aDiscountSlab.setLowerRange(rs.getString("lower_range"));
                aDiscountSlab.setUpperRange(rs.getString("upper_range"));
                aDiscountSlab.setDiscount(rs.getString("discount"));
                return aDiscountSlab;
        }
}
