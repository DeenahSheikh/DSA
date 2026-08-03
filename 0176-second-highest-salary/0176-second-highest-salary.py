import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    x = employee['salary'].sort_values(ascending=False).drop_duplicates()
    if len(x)<2:
        return pd.DataFrame([np.NaN ],columns=['SecondHighestSalary'])
    else:
        y = x.iloc[1]
        return pd.DataFrame([y],columns=['SecondHighestSalary'])