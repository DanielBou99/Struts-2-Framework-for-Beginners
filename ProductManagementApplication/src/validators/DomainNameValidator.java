package validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class DomainNameValidator extends FieldValidatorSupport{

	@Override
	public void validate(Object arg0) throws ValidationException {
		
		try {
			String fieldName = getFieldName();
			Integer price = (Integer)getFieldValue(fieldName, arg0);
			
			if(price <= 0) {
				addFieldError(fieldName, arg0);
			}
		
		} catch (Exception e) {
			System.out.println("Price is empty.");
		}
	}

}
