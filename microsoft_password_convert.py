import csv

# 输入输出文件路径
input_file = 'microsoft_export.csv'
output_file = 'converted_output.csv'

# 读取微软认证器导出的CSV并转换
with open(input_file, 'r', newline='', encoding='utf-8') as infile, \
     open(output_file, 'w', newline='', encoding='utf-8') as outfile:
    
    reader = csv.DictReader(infile)
    fieldnames = ['name', 'url', 'username', 'password', 'note']
    writer = csv.DictWriter(outfile, fieldnames=fieldnames)
    
    writer.writeheader()
    
    for row in reader:
        name = row['username']
        url = row['url']
        username = row['username']
        password = row['password']
        note = ''  # 留空
        writer.writerow({
            'name': name,
            'url': url,
            'username': username,
            'password': password,
            'note': note
        })

print("转换完成，文件已保存为:", output_file)
