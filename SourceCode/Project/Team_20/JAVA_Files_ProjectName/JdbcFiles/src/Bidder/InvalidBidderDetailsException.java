package Bidder;

public class InvalidBidderDetailsException {

    private String message;

    public InvalidBidderDetailsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "InvalidBidderDetailsException: " + message;
    }
}
