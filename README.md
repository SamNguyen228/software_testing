# BÁO CÁO BÀI TẬP MÔN KIỂM THỬ PHẦN MỀM

---

## I. Giới thiệu chung

Repository này được sử dụng để **lưu trữ báo cáo, mã nguồn và minh chứng** cho toàn bộ các bài tập thực hành của môn **Kiểm thử phần mềm**.

Nội dung báo cáo bao gồm nhiều hình thức kiểm thử khác nhau như:

* Kiểm thử thị giác (Visual Testing)
* Kiểm thử tự động End-to-End (E2E Testing)
* Kiểm thử đơn vị (Unit Testing)

---

## II. Thông tin sinh viên

* **Họ và tên:** Nguyễn Dương Sâm
* **Mã sinh viên:** BIT230359
* **Lớp:** SOFT5
* **Môn học:** Kiểm thử phần mềm

---

## III. Bài tập 1 – Kiểm thử thị giác (Visual Testing)

### 1. Tên bài tập

Kiểm thử thị giác trang web CantUnsee

### 2. Công cụ sử dụng

Trang web: [https://cantunsee.space/](https://cantunsee.space/)

### 3. Mục tiêu

Bài tập nhằm rèn luyện khả năng quan sát, so sánh giao diện người dùng (UI) và phát hiện các khác biệt nhỏ trong thiết kế giao diện, từ đó nâng cao kỹ năng kiểm thử phần mềm và sự chú ý đến chi tiết.

### 4. Quy trình thực hiện

* Truy cập trang web CantUnsee.
* Thực hiện đầy đủ các bài kiểm thử so sánh giao diện theo yêu cầu của hệ thống.
* Ghi nhận kết quả và điểm số sau khi hoàn thành.
* Chụp ảnh màn hình làm minh chứng cho quá trình và kết quả thực hiện.

### 5. Kết quả

* Bài kiểm thử được hoàn thành đầy đủ.
* Kết quả và điểm số đạt được đúng theo yêu cầu đề bài.
* Minh chứng được lưu trữ đầy đủ trong repository.

### 6. Minh chứng
  
  ![Ảnh chụp kết quả cuối cùng](./visual-testing/CantUnsee.png)

### 7. Kết luận

Thông qua bài tập này, em đã nâng cao khả năng phát hiện lỗi giao diện, hiểu rõ hơn tầm quan trọng của kiểm thử thị giác trong việc đảm bảo chất lượng trải nghiệm người dùng.

---

## IV. Bài tập 2 – Kiểm thử đơn vị (Unit Test với JUnit)

### 1. Tên bài tập

* **Student Analyzer – Unit Test với JUnit 5**

---

### 2. Công nghệ sử dụng

* **Ngôn ngữ:** Java
* **Framework kiểm thử:** JUnit 5
* **IDE:** Visual Studio Code

---

### 3. Mô tả bài toán

* Xây dựng chương trình **phân tích điểm số học sinh**
* Viết **Unit Test** để kiểm tra các chức năng xử lý dữ liệu
* Đảm bảo chương trình hoạt động đúng thông qua kiểm thử tự động

Chương trình tập trung vào:

* Phân tích danh sách điểm số
* Đảm bảo phép tính chính xác và dữ liệu đầu vào hợp lệ
* Kiểm tra logic xử lý bằng **JUnit 5**

---

### 4. Các chức năng được kiểm thử

* **Đếm số học sinh đạt loại Giỏi**

  * Điều kiện: điểm **≥ 8.0**

* **Tính điểm trung bình hợp lệ**

  * Chỉ chấp nhận điểm trong khoảng **0 – 10**
  * Bỏ qua các giá trị không hợp lệ (âm hoặc lớn hơn 10)

---

### 5. Cấu trúc thư mục dự án

```
student-analyzer-unit-test
├── .vscode/                 # Cấu hình cho Visual Studio Code
├── bin/                     # File biên dịch (.class)
├── lib/                     # Thư viện JUnit
├── src/                     # Mã nguồn chính
│   ├── App.java
│   └── StudentAnalyzer.java
├── test/                    # Mã nguồn kiểm thử
│   └── StudentAnalyzerTest.java
```

**Giải thích:**

* `src/`: Chứa logic chính của chương trình
* `test/`: Chứa các test case viết bằng JUnit
* `lib/`: Chứa các file `.jar` của JUnit 5

---

### 6. Cách thực hiện kiểm thử (chi tiết)

#### Bước 1: Mở project

* Mở **Visual Studio Code**
* Chọn **File → Open Folder**
* Mở thư mục `student-analyzer-unit-test`

#### Bước 2: Kiểm tra thư viện JUnit

* Đảm bảo thư mục `lib/` đã chứa đầy đủ thư viện **JUnit 5 (junit-jupiter)**

#### Bước 3: Mở file kiểm thử

* Mở file:

```
test/StudentAnalyzerTest.java
```

#### Bước 4: Chạy Unit Test

* Nhấn **Run Test** hoặc **Run All Tests** (nút ▶ bên cạnh mỗi test)
* Hoặc chạy trong **Testing Panel** của VS Code

---

### 7. Kết quả kiểm thử

* Tất cả các test case đều **PASS**
* Không xảy ra lỗi logic hoặc exception

Các chức năng:

* Đếm số học sinh đạt loại Giỏi
* Tính điểm trung bình hợp lệ

=> Đều cho kết quả **đúng theo yêu cầu đề bài**

Kết quả được hiển thị trực tiếp trong **JUnit Test Runner** của Visual Studio Code.

---

### 8. Kết luận

* Hiểu được khái niệm và vai trò của **Unit Test**
* Biết cách sử dụng **JUnit 5** để viết và chạy test case
* Nâng cao kỹ năng kiểm tra và đảm bảo chất lượng mã nguồn
* Làm quen với quy trình phát triển phần mềm chuyên nghiệp

---

## V. Bài tập 3 – Kiểm thử tự động End-to-End với Cypress

### 1. Tên bài tập

* **Kiểm thử End-to-End trang web Saucedemo bằng Cypress**

---

### 2. Công cụ và công nghệ

* **Node.js**
* **Cypress**
* **Visual Studio Code**
* **Trang web kiểm thử:** [https://www.saucedemo.com](https://www.saucedemo.com)

---

### 3. Mục tiêu

* Làm quen với kiểm thử tự động **End-to-End (E2E)**
* Tự động hóa các kịch bản kiểm thử phổ biến của trang web thương mại điện tử
* Hiểu cách mô phỏng hành vi người dùng thực tế (đăng nhập, mua hàng, thanh toán)

---

### 4. Các kịch bản kiểm thử

#### 4.1. Kiểm thử đăng nhập thành công

* Đăng nhập với tài khoản hợp lệ
* Xác minh chuyển hướng đến trang danh sách sản phẩm

#### 4.2. Kiểm thử đăng nhập thất bại

* Đăng nhập với tài khoản không hợp lệ
* Kiểm tra thông báo lỗi hiển thị

#### 4.3. Thêm sản phẩm vào giỏ hàng

* Thêm sản phẩm đầu tiên vào giỏ hàng
* Xác minh số lượng sản phẩm trong giỏ hàng

#### 4.4. Sắp xếp sản phẩm theo giá

* Chọn bộ lọc **Price (low to high)**
* Xác minh sản phẩm có giá thấp nhất hiển thị đầu tiên

#### 4.5. Xóa sản phẩm khỏi giỏ hàng

* Thêm sản phẩm vào giỏ hàng
* Thực hiện xóa sản phẩm
* Kiểm tra giỏ hàng không còn sản phẩm

#### 4.6. Quy trình thanh toán

* Thêm sản phẩm vào giỏ hàng
* Điền thông tin thanh toán
* Xác minh chuyển đến trang xác nhận thanh toán

---

### 5. Cấu trúc thư mục dự án

```
cypress-exercise
├── cypress
│   ├── e2e
│   │   ├── login_spec.cy.js     # Test đăng nhập
│   │   └── cart_spec.cy.js      # Test giỏ hàng & thanh toán
│   ├── fixtures                # Dữ liệu test (nếu có)
│   ├── support                 # Cấu hình và command dùng chung
│   └── videos                  # Video kết quả test
│       ├── login_spec.cy.js.mp4
│       └── cart_spec.cy.js.mp4
├── node_modules
├── cypress.config.js
├── package.json
└── package-lock.json
```

---

### 6. Cách chạy kiểm thử Cypress (chi tiết)

#### Bước 1: Mở project

* Mở **Visual Studio Code**
* Chọn **File → Open Folder**
* Mở thư mục `cypress-exercise`

#### Bước 2: Cài đặt thư viện

* Mở Terminal và chạy lệnh:

```
npm install
```

#### Bước 3: Mở Cypress Test Runner

* Chạy lệnh:

```
npx cypress open
```

#### Bước 4: Chạy kiểm thử

* Chọn **E2E Testing**
* Chọn trình duyệt (**Chrome** hoặc **Electron**)
* Click chạy các file:

  * `login_spec.cy.js`
  * `cart_spec.cy.js`

---

### 7. Kết quả kiểm thử

* Tất cả các kịch bản kiểm thử đều **PASS**
* Không xảy ra lỗi trong các luồng nghiệp vụ chính
* Video kết quả được tự động lưu trong thư mục:

  * `cypress/videos`

---

### 8. Minh chứng

* **Video E2E Testing – Spec Login**
  [https://github.com/user-attachments/assets/2455ea2b-b4f9-4ab7-80b1-0b62087bf74e](https://github.com/user-attachments/assets/2455ea2b-b4f9-4ab7-80b1-0b62087bf74e)

* **Video E2E Testing – Spec Cart**
  [https://github.com/user-attachments/assets/375d578f-fae4-4642-a489-f42fa065277f](https://github.com/user-attachments/assets/375d578f-fae4-4642-a489-f42fa065277f)

---

### 9. Kết luận

* Cypress là công cụ mạnh mẽ cho kiểm thử tự động **End-to-End**
* Giúp mô phỏng chính xác hành vi người dùng thực tế
* Phát hiện lỗi sớm trong toàn bộ luồng nghiệp vụ
* Giảm chi phí và thời gian kiểm thử thủ công
* Nâng cao chất lượng và độ tin cậy của hệ thống

---

## VI. Kết luận chung

Thông qua các bài tập trong học phần Kiểm thử phần mềm, em đã:

* Nắm được nhiều hình thức kiểm thử khác nhau.
* Hiểu rõ vai trò của kiểm thử trong vòng đời phát triển phần mềm.
* Nâng cao kỹ năng sử dụng các công cụ kiểm thử hiện đại.

Báo cáo này sẽ tiếp tục được cập nhật trong suốt quá trình học tập của học phần.
