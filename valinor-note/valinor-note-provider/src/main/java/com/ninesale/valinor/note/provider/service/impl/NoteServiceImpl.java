/**   
* @Title: NoteServiceImpl.java 
* @Package com.ninesale.valinor.note.provider.service.impl 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月3日 上午10:25:47 
* @version V0.1
*/
package com.ninesale.valinor.note.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ninesale.valinor.note.provider.dao.NoteMapper;
import com.ninesale.valinor.note.provider.service.NoteService;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 上午10:25:47
 * 
 */
@Service
public class NoteServiceImpl implements NoteService {

	@Resource
	private NoteMapper noteMapper;

}
