package com.poly.sof3021.B3_Request_ModelAttirbute.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DangKyRequest {

    @NotEmpty(message = "Tên trống")
    @Size(min = 5, message = "Tên quá ngắn")
    private String hoVaTen;

//    @Pattern(regexp = "\\d") // Định dạng
    @Min(18)
    @NotNull
    private Integer tuoi;

    @NotEmpty(message = "Ngành học trống")
    private String nganhHoc;

    @NotEmpty(message = "Quê quán trống")
    private String queQuan;

    @NotEmpty(message = "Mật khẩu trống")
    private String matKhau;

    @NotEmpty(message = "Xác nhận mật khẩu trống")
    private String xacNhanMatKhau;

}
