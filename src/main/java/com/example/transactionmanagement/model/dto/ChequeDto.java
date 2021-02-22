/**
 * @Since Feb 18, 2021
 * @Author Nayeem Biswas
 * @Project transaction-management
 * @Package com.example.transactionmanagement.model.dto
 */
package com.example.transactionmanagement.model.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.transactionmanagement.common.message.CustomMessage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Nayeem
 *
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChequeDto {
	
	private Long id;
	
	private String payTo;
	
	private String sumOfAmount;
	
	private int taka;
	
	private String accountNo;

	private String branchName;

	private String day;
	
	private String month;
	
	private String year;

}
