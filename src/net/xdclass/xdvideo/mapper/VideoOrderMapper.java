package net.xdclass.xdvideo.mapper;

import java.util.List;
import net.xdclass.xdvideo.domain.VideoOrder;
import net.xdclass.xdvideo.domain.VideoOrderExample;
import org.apache.ibatis.annotations.Param;

public interface VideoOrderMapper {
    int countByExample(VideoOrderExample example);

    int deleteByExample(VideoOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoOrder record);

    int insertSelective(VideoOrder record);

    List<VideoOrder> selectByExample(VideoOrderExample example);

    VideoOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoOrder record, @Param("example") VideoOrderExample example);

    int updateByExample(@Param("record") VideoOrder record, @Param("example") VideoOrderExample example);

    int updateByPrimaryKeySelective(VideoOrder record);

    int updateByPrimaryKey(VideoOrder record);
}