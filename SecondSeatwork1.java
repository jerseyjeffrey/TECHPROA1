public class SecondSeatwork1 {
        static class Product {
                private String name;
                        private double price;
                                private int quantity;

                                        public Product(String name, double price, int quantity) {
                                                    this.name = name;
                                                                this.price = price;
                                                                            this.quantity = quantity;
                                                                                    }

                                                                                            public String getName() {
                                                                                                        return name;
                                                                                                                }

                                                                                                                        public double getPrice() {
                                                                                                                                    return price;
                                                                                                                                            }

                                                                                                                                                    public int getQuantity() {
                                                                                                                                                                return quantity;
                                                                                                                                                                        }

                                                                                                                                                                                public double getTotalAmount() {
                                                                                                                                                                                            return price * quantity;
                                                                                                                                                                                                    }
                                                                                                                                                                                                        }

                                                                                                                                                                                                            public static void main(String[] args) {
                                                                                                                                                                                                                    Product p = new Product("Computer", 1000.5, 3);
                                                                                                                                                                                                                            System.out.println("Product name: " + p.getName());
                                                                                                                                                                                                                                    System.out.println("Price: " + p.getPrice());
                                                                                                                                                                                                                                            System.out.println("Quantity: " + p.getQuantity());
                                                                                                                                                                                                                                                    System.out.println("Total Amount: " + p.getTotalAmount());
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }

