import os
import requests
from pathlib import Path

NOTION_TOKEN = os.getenv("NOTION_TOKEN")
DATABASE_ID = os.getenv("NOTION_DATABASE_ID")

headers = {
    "Authorization": f"Bearer {NOTION_TOKEN}",
    "Content-Type": "application/json",
    "Notion-Version": "2022-06-28",
}

def create_notion_page(name, category, solution_link):
    data = {
        "parent": {"database_id": DATABASE_ID},
        "properties": {
            "Name": {"title": [{"text": {"content": name}}]},
            "Status": {"select": {"name": "Done"}},  # Change if needed
            "Category": {"select": {"name": category}},
            "Solution": {"url": solution_link},
        }
    }
    res = requests.post("https://api.notion.com/v1/pages", headers=headers, json=data)
    if res.status_code != 200:
        print(f"Error {res.status_code}: {res.text}")
    else:
        print(f"✅ Added: {name}")

# Customize your repo URL below
REPO_URL = "https://github.com/deepz2609/DSA/blob/main"

base_path = Path('.')
for path in base_path.rglob("*.*"):
    if path.suffix in ['.java', '.py', '.cpp']:
        parts = path.parts
        if len(parts) >= 2:
            category = parts[-2]
            name = path.stem
            solution_url = f"{REPO_URL}/{path.as_posix()}"
            create_notion_page(name, category, solution_url)
