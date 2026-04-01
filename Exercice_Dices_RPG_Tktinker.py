import random
import tkinter as tk

# Criar a janela principal
janela = tk.Tk()
janela.title('DADOS DE RPG')
janela.geometry('490x150')
janela.configure(background='#C0D9D9')

# Criar variáveis
x = tk.IntVar()

# Criar a seção dos botões
dado4 = tk.Button(janela, text='D4', font='Arial 14', bg='#FFCC00', fg='#ffffff', command=lambda: x.set(random.randint(1, 4)))
dado4.grid(row=1, column=1, padx=4, pady=4, sticky='w')

dado6 = tk.Button(janela, text='D6', font='Arial 14', bg='#FF6600', fg='#ffffff', command=lambda: x.set(random.randint(1, 6)))
dado6.grid(row=1, column=2, padx=4, pady=4)

dado8 = tk.Button(janela, text='D8', font='Arial 14', bg='#CC0000', fg='#ffffff', command=lambda: x.set(random.randint(1, 8)))
dado8.grid(row=1, column=3, padx=4, pady=4)

dado10 = tk.Button(janela, text='D10', font='Arial 14', bg='#993366', fg='#ffffff', command=lambda: x.set(random.randint(1, 10)))
dado10.grid(row=1, column=4, padx=4, pady=4)

dado12 = tk.Button(janela, text='D12', font='Arial 14', bg='#3333FF', fg='#ffffff', command=lambda: x.set(random.randint(1, 12)))
dado12.grid(row=1, column=5, padx=4, pady=4)

dado20 = tk.Button(janela, text='D20', font='Arial 14', bg='#009900', fg='#ffffff', command=lambda: x.set(random.randint(1, 20)))
dado20.grid(row=1, column=6, padx=4, pady=4)

dado100 = tk.Button(janela, text='D100', font='Arial 14', bg='#4F4F2F', fg='#ffffff', command=lambda: x.set(random.randint(1, 100)))
dado100.grid(row=1, column=7, padx=4, pady=4)

# Criar a seção do resultado
resultado = tk.Label(janela, text='RESULTADO:', font='Arial 14')
resultado.grid(row=2, column=4)

LabelDado = tk.Label(janela, text='', font='Arial 14', textvariable=x)
LabelDado.grid(row=2, column=5)

# Iniciar a janela principal
janela.mainloop()