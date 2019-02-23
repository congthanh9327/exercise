public enum CustomerType {
    LIVING(1, "Living"),
    BUSINESS(2, "Business"),
    MANUFACTURING(3, "Manufacturing");

    private int code;
    private String name;

    CustomerType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static CustomerType getCustomerTypeByCode(int code) {
        for (CustomerType item : CustomerType.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }
};
