package com.example.provider.mapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lixiaotian
 * @since 2021/06/25 14:34
 */
@Mapper
public interface UserMapper {
    String getInfo(int id);
}
