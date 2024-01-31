package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "043-211-2455";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        String address = "충청북도 청주시 청원구 오창읍 성산2길 10 블랙앤화이트";
        return address;
    }
    // 호텔 액티비티
    public static String getActivities() {
        return "탁구장, 볼링장, 노래방";
    }
    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        String address = getAddress();
        System.out.println("호텔 전화번호 : " + contactNumber);
        System.out.println("호텔 주소 : " + address);
        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
