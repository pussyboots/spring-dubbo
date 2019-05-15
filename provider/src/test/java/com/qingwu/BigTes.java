package com.qingwu;

import java.math.BigDecimal;

import org.junit.Test;

public class BigTes {

	/** 
	* @Title: bigTest 
	* @Description: BigDecimal 运算时 最好是最后进行除法运算
	* @param 
	* @return void 
	*/
	@Test
	public void bigTest() {
		BigDecimal allAmount = new BigDecimal("830.00"); // 实际支付的订单总金额
		BigDecimal allDetalAmount = new BigDecimal("0.00");
		String[] str = {"420.00", "410.00"}; 
		for (String string : str) {
			allDetalAmount = allDetalAmount.add(new BigDecimal(string));
		}
		System.out.println(allDetalAmount);
		System.out.println(allAmount);
		
		BigDecimal amount = new BigDecimal("410.00").divide(allDetalAmount, 2, BigDecimal.ROUND_HALF_UP)
				.multiply(allAmount);
		
		BigDecimal amounty1 = allAmount.multiply(new BigDecimal("410.00")).divide(allDetalAmount, 2, BigDecimal.ROUND_HALF_UP);
		System.out.println(amounty1.intValue()/ 830.00);
		System.out.println(amounty1);
		
		System.out.println(amount);
		System.out.println("-=-=-=-=" + 410.00/830.00);
		System.out.println(new BigDecimal("410.00").divide(allDetalAmount, 2, BigDecimal.ROUND_HALF_UP));
		System.out.println(410.56 * 830.00);
		System.out.println(allAmount.multiply(new BigDecimal("410.56")));
	}
}
