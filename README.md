# <div align="center"> E-Commercer </center>
 
<div align="center"> <img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?&style=for-the-badge&logo=java&logoColor=white"/> <img alt="Spring" src="https://img.shields.io/badge/spring%20-%236DB33F.svg?&style=for-the-badge&logo=spring&logoColor=white"/> <img alt="MySQL" src="https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white"/> <img alt="TypeScript" src="https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white"/> 
 
  </div>


<br>

## 📋 ERD
<img width="734" height="805" alt="e-commercer-erd" src="https://github.com/user-attachments/assets/6b0daf89-b54e-4423-9ce7-2c9a03693d6a" />
<br>


<br>


## 🪟 서비스 구현 화면

### 홈 화면

<img width="1901" height="737" alt="E-main" src="https://github.com/user-attachments/assets/6981c268-f12b-43ba-8795-3250fd9f9de2" />

###  제품 상세 보기

<img width="1915" height="772" alt="E-detail" src="https://github.com/user-attachments/assets/d807f667-56ed-453c-ba65-7943e96a2606" />

###  장바구니

<img width="1891" height="845" alt="E-shopping" src="https://github.com/user-attachments/assets/9e166fca-e0c8-46c4-b9ba-58b869bdf9ef" />

###  결제창

<img width="1886" height="835" alt="E-checkout1" src="https://github.com/user-attachments/assets/2ce0135f-67bf-481e-92ef-91ae22c1005a" />
<img width="1893" height="857" alt="E-checkout2" src="https://github.com/user-attachments/assets/08d2f30a-2e8a-4c25-a733-7378fa119e0b" />

###  주문내역

<img width="1891" height="738" alt="E-orders" src="https://github.com/user-attachments/assets/68bef195-a977-4445-a16e-efdd8cf13989" />

###  카드 결제 결과 화면

<img width="1863" height="822" alt="Stripe" src="https://github.com/user-attachments/assets/f45ce398-5954-4bab-b218-ede253f8daa0" />
<img width="1605" height="727" alt="Stripe2" src="https://github.com/user-attachments/assets/8a208324-8a6c-4255-a6b7-2e12b03ea6f6" />


## 👆 필수 기능
1. Auth0을 이용한 회원가입/로그인
2. 검색 / 장바구니 / 상세페이지 / 결제페이지 / 주문 목록 구현
3. 주문 목록 등 사용자의 민감한 정보들을 보호하기 위해 사용자의 정보가 들어가있는 end-point 보안화 (토큰 발행)
4. Stripe를 이용해 카드결제 및 결제 후 알림 구현


## 👍 느낀 점
프론트로 화면을 화려하게 꾸미기보다 기본적인 기능들에 더 집중한 프로젝트였던 것 같다. 기본적인 db 설계부터 시작해서 하나씩 쌓아가는 과정이 너무 재밌었다. 물론 HTTP 통신에서 많은 에러를 만나 하루종일 붙잡을 때가 많았는데, 하나씩 풀어가는 과정이 재밌었다. 특히 결제부분을 코딩할 때 갑자기 500 에러를 마주쳐서 하나씩 뜯어보며 경로가 틀어져있는지 확인했는데 알고보니 경로문제가 아니라 정보를 넘겨줄 때 단위가 overflow되어 에러가 발생한다는 것을 알고 굉장히 허무했던 기억이 난다.. 그 밖에도 직접 Postman을 통해 HTTP request를 보내며 잘 작동했을 때 기분이 좋았던 기억이 난다. 이 프로젝트 이후에 다음 프로젝트에는 좀 더 예쁘게 꾸며보고 다른 다양한 기능들을 추가하고 싶다! 


