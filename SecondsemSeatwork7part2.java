class PasswordException extends Exception {
    	public PasswordException(String message) {
        	}
            }

            public class SecondsemSeatwork7part2 {
            	
                	static void checkPassword(String Password) throws PasswordException {
                    		if(Password.length() < 8 ) {
                            			throw new PasswordException("Password must be at least 8 characters long");
                                        		}else{
                                                			System.out.println("Password accepted");
                                                            		}
                                                                    	}
                                                                        	public static void main(String[] args) {
                                                                            		try{
                                                                                    			checkPassword("abc123");
                                                                                                		}catch (PasswordException e) {
                                                                                                        			System.out.println("User-Defined Exception: " + e.getMessage());
                                                                                                                    		}
                                                                                                                            		
                                                                                                                                    	}
                                                                                                                                        }
                                                                                                                                    
