import os
import requests
from pathlib import Path

NOTION_TOKEN = os.getenv("NOTION_TOKEN")
DATABASE_ID = os.getenv("NOTION_DATABASE_ID")

# Check if environment variables are set
if not NOTION_TOKEN:
    print("Error: NOTION_TOKEN environment variable is not set")
    exit(1)

if not DATABASE_ID:
    print("Error: NOTION_DATABASE_ID environment variable is not set")
    exit(1)

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
            "Status": {"status": {"name": "Done"}},  # Fixed: using status property type
            "Category": {"select": {"name": category}},
            "Solution": {"rich_text": [{"text": {"content": solution_link}}]},  # Fixed: using rich_text property type
        }
    }
    
    try:
        res = requests.post("https://api.notion.com/v1/pages", headers=headers, json=data)
        if res.status_code == 200 or res.status_code == 201:
            print(f"✅ Added: {name}")
        else:
            print(f"Error {res.status_code}: {res.text}")
    except requests.RequestException as e:
        print(f"Request failed for {name}: {e}")
    except Exception as e:
        print(f"Unexpected error for {name}: {e}")

# Customize your repo URL below
REPO_URL = "https://github.com/deepz2609/DSA/blob/main"

print("Starting to process files...")
base_path = Path('.')
files_processed = 0

for path in base_path.rglob("*.*"):
    if path.suffix in ['.java', '.py', '.cpp']:
        # Skip files in .github folder
        if '.github' in path.parts:
            continue
        parts = path.parts
        if len(parts) >= 2:
            category = parts[-2]
            name = path.stem
            solution_url = f"{REPO_URL}/{path.as_posix()}"
            print(f"Processing: {name} in category: {category}")
            create_notion_page(name, category, solution_url)
            files_processed += 1

print(f"Finished processing {files_processed} files.")
