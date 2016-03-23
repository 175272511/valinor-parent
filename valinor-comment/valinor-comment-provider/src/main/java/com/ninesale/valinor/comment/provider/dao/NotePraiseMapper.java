package com.ninesale.valinor.comment.provider.dao;

import java.util.List;

import com.ninesale.valinor.comment.provider.model.DtoNotePraise;

public interface NotePraiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoNotePraise record);

    int insertSelective(DtoNotePraise record);

    DtoNotePraise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoNotePraise record);

    int updateByPrimaryKey(DtoNotePraise record);

	/**
	 * @param notePraise
	 */
	void deleteBySelective(DtoNotePraise notePraise);

	/**
	 * @param dtoPraise
	 * @return
	 */
	List<DtoNotePraise> selectBySelective(DtoNotePraise dtoPraise);
}