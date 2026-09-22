# ==============================================================================
# 00. 설치 및 환경 설정 가이드 (터미널에서 먼저 실행)
# ==============================================================================
# 1) 파이썬 설치 확인: python --version
# 2) 가상환경 생성: python -m venv venv
# 3) 가상환경 활성화:
#    - Windows (CMD): venv\Scripts\activate
#    - Windows (PowerShell): .\venv\Scripts\Activate.ps1
#    - Windows (Git Bash) / Mac / Linux: source venv/Scripts/activate (Mac은 venv/bin/activate)
#    * 활성화 성공 시 터미널 왼쪽에 (venv) 가 표시됩니다.
# 4) 필수 패키지 설치: pip install numpy pandas
# ==============================================================================

# ==============================================================================
# [1교시] Python 핵심 (Java/JS 문법 비교 및 핵심 문법)
# ==============================================================================

print("\n\n--- [1] Python 핵심 ---")

print("\n--- 0. 변수 선언 및 출력 ---")
### 실습


print("\n--- 1. 제어문 (if) ---")
### 실습


print("\n--- 2. 반복문 (for i in range) ---")
### 실습


print("\n--- 3. 리스트(List) ---")
### 실습


print("\n--- 4. 딕셔너리(Dictionary) ---")
### 실습


print("\n--- 5. 컴프리헨션(Comprehension) ---")
### 실습


# ------------------------------------------------------------------------------
# ✏️ [연습문제 01 - Python 기초 및 컴프리헨션]
# ------------------------------------------------------------------------------
# Q1. scores 리스트에서 60점 이상인 점수만 10점씩 가산한 `passed_scores` 리스트를 만드세요.
# Q2. members 리스트의 각 이름을 Key로, "OFFLINE"을 Value로 갖는 `status_dict` 딕셔너리를 만드세요.
#
# 🎯 [목표 출력 결과]
# Q1 결과: [85, 98, 105, 70]
# Q2 결과: {'kim': 'OFFLINE', 'lee': 'OFFLINE', 'park': 'OFFLINE'}

scores = [45, 75, 88, 52, 95, 60]
members = ["kim", "lee", "park"]

# --- [작성 공간] ---
# TODO: 아래 변수들의 코드를 직접 완성해 보세요!
passed_scores = None
status_dict = None


# --- [출력 확인 공간] ---
print("\n--- [연습문제 01 결과 확인] ---")
print("Q1 결과:", passed_scores)
print("Q2 결과:", status_dict)


# ==============================================================================
# [2교시] NumPy 기초: 수치 데이터 및 배열 다루기
# ==============================================================================

print("\n\n--- [2] NumPy 기초 ---")

import numpy as np

print("\n--- 1. 1차원 및 2차원 배열(NDArray) 생성 ---")
### 실습


print("\n--- 2. 인덱싱 및 슬라이싱 [행, 열] ---")
### 실습


print("\n--- 3. 조건부 추출 (Boolean Indexing) ---")
### 실습


print("\n--- 4. 수치 통계 연산 및 Axis(축) 연산 ---")
### 실습


# ------------------------------------------------------------------------------
# ✏️ [연습문제 02 - NumPy 다차원 배열 연산]
# ------------------------------------------------------------------------------
# store_data는 4개 매장의 [주문 건수, 총 결제 금액] 데이터입니다.
# Q1. 주문 건수(0번 열)가 30건 이상인 매장의 데이터만 추출하여 `over_30_stores`에 저장하세요.
# Q2. 전체 매장의 총 결제 금액(1번 열) 합계(`total_pay`)와 주문 건수(0번 열)의 평균(`avg_orders`)을 구하세요.
#
# 🎯 [목표 출력 결과]
# Q1 결과 (주문 30건 이상 매장):
# [[    40 120000]
#  [    85 250000]
#  [    50 180000]]
# Q2 결과 -> 총 결제 금액: 585000원, 평균 주문 건수: 47.5건

store_data = np.array([
    [40, 120000],
    [15, 35000],
    [85, 250000],
    [50, 180000]
])

# --- [작성 공간] ---
# TODO: 아래 변수들의 코드를 직접 완성해 보세요!
over_30_stores = None
total_pay = None
avg_orders = None


# --- [출력 확인 공간] ---
print("\n--- [연습문제 02 결과 확인] ---")
print("Q1 결과 (주문 30건 이상 매장):\n", over_30_stores)
print(f"Q2 결과 -> 총 결제 금액: {total_pay}원, 평균 주문 건수: {avg_orders}건")


# ==============================================================================
# [3~4교시] Pandas 데이터 정제 & 실전 집계 (EDA)
# ==============================================================================

print("\n\n--- [3] Pandas 데이터 정제 & 실전 집계 ---")

import pandas as pd

print("\n--- 1. 샘플 데이터 생성 및 DataFrame 변환 ---")
### 실습


print("\n--- 2. 데이터 탐색 메서드 (head, info, describe) ---")
### 실습


print("\n--- 3. 조건 조회 (Boolean Filtering) 및 파생 컬럼 생성 ---")
### 실습


print("\n--- 4. 핵심 그룹화 연산 (groupby) ---")
### 실습


print("\n--- 5. 분석 결과를 파이썬 리스트로 추출 ---")
### 실습


# ------------------------------------------------------------------------------
# ✏️ [연습문제 03 - Pandas 필터링, 컬럼 생성 및 Groupby]
# ------------------------------------------------------------------------------
# Q1. log_df에서 status_code가 200인 행만 추출해 `success_df`를 만드세요.
# Q2. log_df에 response_time_ms를 1000으로 나눈 `response_time_sec` 컬럼을 추가하세요.
# Q3. server별 response_time_ms의 평균을 구해 `server_summary` DataFrame을 만들고, 
#     서버 이름 목록을 `server_list` 파이썬 리스트로 추출하세요.
#
# 🎯 [목표 출력 결과]
# Q1 결과 (정상 응답):
#      server  status_code  response_time_ms
# 0  Server_A          200               120
# 2  Server_A          200               150
# 3  Server_B          200               200
#
# Q3 결과 (서버별 평균 응답시간 집계):
#      server  response_time_ms
# 0  Server_A        116.666667
# 1  Server_B        325.000000
# Q3 리스트 변환 결과: ['Server_A', 'Server_B']

log_data = [
    {'server': 'Server_A', 'status_code': 200, 'response_time_ms': 120},
    {'server': 'Server_B', 'status_code': 500, 'response_time_ms': 450},
    {'server': 'Server_A', 'status_code': 200, 'response_time_ms': 150},
    {'server': 'Server_B', 'status_code': 200, 'response_time_ms': 200},
    {'server': 'Server_A', 'status_code': 404, 'response_time_ms': 80},
]

log_df = pd.DataFrame(log_data)

# --- [작성 공간] ---
# TODO: 아래 코드들을 직접 작성해 보세요!
success_df = None

# TODO: log_df에 'response_time_sec' 컬럼을 생성하는 코드를 작성하세요.

server_summary = None
server_list = None


# --- [출력 확인 공간] ---
print("\n--- [연습문제 03 결과 확인] ---")
print("Q1 결과 (정상 응답):\n", success_df)
print("\nQ3 결과 (서버별 평균 응답시간 집계):\n", server_summary)
print("Q3 리스트 변환 결과:", server_list)