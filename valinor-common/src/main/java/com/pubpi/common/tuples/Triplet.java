package com.pubpi.common.tuples;

import java.io.Serializable;

/**
 * 三元组
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年9月16日 下午3:41:22
 * 
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class Triplet<A, B, C> implements Serializable {
	private static final long serialVersionUID = -1693395431539793647L;
	public A first;
	public B second;
	public C third;

	public Triplet(A first, B second, C third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
}
