from fastapi import FastAPI
import uvicorn

app = FastAPI()

@app.get("/data/{id}")
def get_data(id: int):
    return {"message": f"Data retrieved for ID {id}"}


if __name__ == "__main__":
    uvicorn.run("main:app", reload=True, port=5000)
