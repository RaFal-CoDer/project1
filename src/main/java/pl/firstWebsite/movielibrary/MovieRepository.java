package pl.firstWebsite.movielibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {

    @Autowired
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public List<Movie> getAll(){
        List<Movie> query = jdbcTemplate.query("Select * from movie", BeanPropertyRowMapper.newInstance(Movie.class));
        return query;

    }
}
