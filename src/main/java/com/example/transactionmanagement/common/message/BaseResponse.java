/**
 * 
 */
package com.example.transactionmanagement.common.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Nayeemul
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
	
	private String messsage;
	private int code;

}
