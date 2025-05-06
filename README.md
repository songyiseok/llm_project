# 🧠 LLM 기반 헬스케어 & 인슈테크 시스템

> **증상 기반 질병 예측 + 보험 추천 + 피부질환 이미지 분석**까지 가능한 AI 융합 헬스케어 서비스  
> 자연어 및 이미지 기반 사용자 입력을 분석하여 맞춤형 건강 및 보험 서비스를 제공합니다.  
> FastAPI + Spring Boot의 하이브리드 백엔드 구조와 LangChain, PyTorch 기반 AI 모델을 통합 구현했습니다.

---

## 🎯 프로젝트 개요

- 🧬 **질병 예측 + 보험 추천**: 증상 입력을 바탕으로 질병을 유추하고, 적합한 보험 상품을 추천합니다.
- 🖼️ **피부 질환 이미지 분석**: 사용자가 업로드한 이미지를 기반으로 피부 질환을 예측합니다.
- 🙋 **회원 기능**: 회원가입/로그인, 마이페이지, 커뮤니티 게시판 등 사용자 맞춤 기능을 제공합니다.

---

## 📂 프로젝트 구조

llm_project/
├── fastapi_ai/
│ ├── main.py # FastAPI 메인 엔드포인트
│ ├── models/ # AI 모델 파일들
│ └── utils/ # 공통 유틸리티 함수들
├── spring_app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/ # Spring Java 소스
│ │ │ └── resources/ # templates, static 등
│ └── pom.xml # Maven 의존성 설정
├── requirements.txt # Python 패키지 목록
├── .gitignore # Git 추적 제외 목록
└── README.md # 프로젝트 설명 문서

---

## 🔧 주요 기능

- ✅ **회원가입 / 로그인** (Spring Security 기반)
- ✅ **건강 점수 분석 + 챗봇 응답** (FastAPI + AI 모델)
- ✅ **증상 기반 질병 예측 챗봇** (LangChain 기반 LLM)
- ✅ **이미지 기반 피부 질환 분석** (PyTorch 이미지 분류)
- ✅ **보험 추천 시스템** (질병명-보험상품 CSV 매핑)
- ✅ **JSP 기반 마이페이지 / 커뮤니티 게시판**

---

## 🛠️ 기술 스택

| 범주        | 기술 구성                             |
|-------------|----------------------------------------|
| **프론트엔드** | JSP, HTML, CSS                        |
| **백엔드**     | Spring Boot (Java), FastAPI (Python) |
| **AI 모델**    | LangChain, PyTorch                   |
| **DB/데이터**  | CSV, SQLite (→ MySQL 확장 가능)     |
| **배포 환경**  | Localhost 개발 환경                  |

---

## 📺 프로젝트 시연 영상

[![시연영상](images/sum.png)](https://www.youtube.com/watch?v=fuqEwFal0tw)

> 클릭하면 YouTube에서 실시간 시연 영상을 확인할 수 있습니다.

---

## 🚀 실행 방법

### ▶ FastAPI 서버 실행 (VS Code 기준)

```bash
cd fastapi_ai
uvicorn main:app --reload

> `localhost:8080` → JSP 페이지 / `localhost:8000` → FastAPI API 엔드포인트

---

## 📌 추가 안내

- `.env` 파일을 직접 생성해 API KEY 또는 민감한 정보를 설정해야 할 수 있습니다.
- FastAPI 모델 추론용 CSV/모델 파일들이 누락되지 않았는지 확인하세요.
- 이미지 분석 기능은 사전 학습된 PyTorch 모델을 사용합니다. 필요 시 다운로드 후 `models/` 폴더에 배치하세요.

---

## 👩‍💻 개발자 정보

- **이름**: 석송이  
- **역할**: AI + 웹 융합 개발자  
- **관심사**: LLM 응용, 건강/보험 도메인 서비스, RAG 시스템, 사용자 중심 챗봇

---

> 본 프로젝트는 실제 서비스를 염두에 두고 설계된 헬스케어 & 인슈테크 통합 시스템으로, AI 모델 활용과 웹 백엔드 통합에 대한 역량을 실질적으로 보여주는 포트폴리오입니다.
