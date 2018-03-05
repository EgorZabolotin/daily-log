package near.lux.dailylog.dao.mapper;

import near.lux.dailylog.dto.PersonDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapper {

    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "firstName", column = "first_name"),
        @Result(property = "lastName", column = "last_name"),
        @Result(property = "middleName", column = "middle_name")
    })
    @Select("select id, login, first_name, last_name, middle_name from person where id=#{id}")
    PersonDTO getPersonById(@Param("id")int id);

    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "firstName", column = "first_name"),
        @Result(property = "lastName", column = "last_name"),
        @Result(property = "middleName", column = "middle_name")
    })
    @Select("select id, login, first_name, last_name, middle_name from person")
    List<PersonDTO> getAllPersons();
}
