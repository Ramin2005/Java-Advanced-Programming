import os

data = []
for i in range(1, 21):
    data.append(str(i))

print(data)
str_data = " ".join(data)
print(str_data)

os.system("java mean_args.java " + str_data)