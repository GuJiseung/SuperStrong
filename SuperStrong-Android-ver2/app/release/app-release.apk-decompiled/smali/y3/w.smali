.class public final Ly3/w;
.super Ly3/d;
.source "SourceFile"


# instance fields
.field public final a:Ly3/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ly3/d;-><init>()V

    invoke-static {}, Ly3/z;->a()Ly3/b;

    move-result-object v0

    iput-object v0, p0, Ly3/w;->a:Ly3/b;

    return-void
.end method


# virtual methods
.method public final b(Ly3/a;Le4/d;)Lf4/a;
    .locals 5

    .line 1
    instance-of v0, p2, Ly3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ly3/s;

    .line 7
    .line 8
    iget v1, v0, Ly3/s;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ly3/s;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly3/s;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ly3/s;-><init>(Ly3/w;Le4/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ly3/s;->e:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lf4/a;->b:Lf4/a;

    .line 28
    .line 29
    iget v2, v0, Ly3/s;->g:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La1/f0;->l(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p2}, La1/f0;->l(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p2, Lq3/j;

    .line 53
    .line 54
    invoke-direct {p2}, Lq3/j;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p1}, Lq3/j;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Ly3/j;

    .line 62
    .line 63
    sget-object v2, Lb4/a;->a:[B

    .line 64
    .line 65
    const-string v2, "jsonString"

    .line 66
    .line 67
    invoke-static {p1, v2}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lb4/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p2, p1}, Ly3/j;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Ly3/t;

    .line 78
    .line 79
    invoke-direct {p1, p0, p2, v3}, Ly3/t;-><init>(Ly3/w;Ly3/j;Le4/d;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iput v4, v0, Ly3/s;->g:I

    .line 86
    .line 87
    invoke-static {p1, v0}, Ly3/d;->a(Lk4/l;Le4/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-ne p2, v1, :cond_3

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    :goto_1
    check-cast p2, Ly3/x;

    .line 95
    .line 96
    iget-object p1, p2, Ly3/x;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Ly3/k;

    .line 99
    .line 100
    if-nez p1, :cond_4

    .line 101
    .line 102
    return-object v3

    .line 103
    :cond_4
    invoke-static {v3}, Lb4/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    throw v3
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final c(Ly3/a0;Le4/d;)Lf4/a;
    .locals 5

    .line 1
    instance-of v0, p2, Ly3/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ly3/u;

    .line 7
    .line 8
    iget v1, v0, Ly3/u;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ly3/u;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly3/u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ly3/u;-><init>(Ly3/w;Le4/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ly3/u;->e:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lf4/a;->b:Lf4/a;

    .line 28
    .line 29
    iget v2, v0, Ly3/u;->g:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La1/f0;->l(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p2}, La1/f0;->l(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p2, Lq3/j;

    .line 53
    .line 54
    invoke-direct {p2}, Lq3/j;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p1}, Lq3/j;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Ly3/j;

    .line 62
    .line 63
    sget-object v2, Lb4/a;->a:[B

    .line 64
    .line 65
    const-string v2, "jsonString"

    .line 66
    .line 67
    invoke-static {p1, v2}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lb4/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p2, p1}, Ly3/j;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Ly3/v;

    .line 78
    .line 79
    invoke-direct {p1, p0, p2, v3}, Ly3/v;-><init>(Ly3/w;Ly3/j;Le4/d;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iput v4, v0, Ly3/u;->g:I

    .line 86
    .line 87
    invoke-static {p1, v0}, Ly3/d;->a(Lk4/l;Le4/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-ne p2, v1, :cond_3

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    :goto_1
    check-cast p2, Ly3/x;

    .line 95
    .line 96
    iget-object p1, p2, Ly3/x;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Ly3/k;

    .line 99
    .line 100
    if-nez p1, :cond_4

    .line 101
    .line 102
    return-object v3

    .line 103
    :cond_4
    invoke-static {v3}, Lb4/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    throw v3
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method
