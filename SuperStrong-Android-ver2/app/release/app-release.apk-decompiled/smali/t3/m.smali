.class public final Lt3/m;
.super Lq3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt3/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lq3/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lq3/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq3/t<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lq3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq3/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lq3/j;

.field public final d:Lw3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Lq3/y;

.field public f:Lq3/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq3/x<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq3/t;Lq3/m;Lq3/j;Lw3/a;)V
    .locals 1

    invoke-direct {p0}, Lq3/x;-><init>()V

    new-instance v0, Lt3/m$a;

    invoke-direct {v0}, Lt3/m$a;-><init>()V

    iput-object p1, p0, Lt3/m;->a:Lq3/t;

    iput-object p2, p0, Lt3/m;->b:Lq3/m;

    iput-object p3, p0, Lt3/m;->c:Lq3/j;

    iput-object p4, p0, Lt3/m;->d:Lw3/a;

    const/4 p1, 0x0

    iput-object p1, p0, Lt3/m;->e:Lq3/y;

    return-void
.end method


# virtual methods
.method public final a(Lx3/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/a;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lt3/m;->d:Lw3/a;

    .line 2
    .line 3
    iget-object v1, p0, Lt3/m;->b:Lq3/m;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lt3/m;->f:Lq3/x;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lt3/m;->e:Lq3/y;

    .line 13
    .line 14
    iget-object v2, p0, Lt3/m;->c:Lq3/j;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, Lq3/j;->d(Lq3/y;Lw3/a;)Lq3/x;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lt3/m;->f:Lq3/x;

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v1, p1}, Lq3/x;->a(Lx3/a;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lx3/a;->M()I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lx3/d; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 28
    .line 29
    .line 30
    :try_start_1
    sget-object v2, Lt3/o;->A:Lt3/o$u;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lt3/o$u;->c(Lx3/a;)Lq3/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lx3/d; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 39
    goto :goto_2

    .line 40
    :catch_0
    move-exception p1

    .line 41
    const/4 v2, 0x0

    .line 42
    goto :goto_1

    .line 43
    :catch_1
    move-exception p1

    .line 44
    new-instance v0, Lq3/u;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Lq3/u;-><init>(Ljava/lang/Exception;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :catch_2
    move-exception p1

    .line 51
    new-instance v0, Lq3/o;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Lq3/o;-><init>(Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :catch_3
    move-exception p1

    .line 58
    new-instance v0, Lq3/u;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lq3/u;-><init>(Ljava/lang/Exception;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :catch_4
    move-exception p1

    .line 65
    const/4 v2, 0x1

    .line 66
    :goto_1
    if-eqz v2, :cond_3

    .line 67
    .line 68
    sget-object p1, Lq3/p;->b:Lq3/p;

    .line 69
    .line 70
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    instance-of p1, p1, Lq3/p;

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    return-object p1

    .line 79
    :cond_2
    iget-object p1, v0, Lw3/a;->b:Ljava/lang/reflect/Type;

    .line 80
    .line 81
    invoke-interface {v1}, Lq3/m;->a()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :cond_3
    new-instance v0, Lq3/u;

    .line 87
    .line 88
    invoke-direct {v0, p1}, Lq3/u;-><init>(Ljava/lang/Exception;)V

    .line 89
    .line 90
    .line 91
    throw v0
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
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
.end method

.method public final b(Lx3/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/c;",
            "TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lt3/m;->d:Lw3/a;

    .line 2
    .line 3
    iget-object v1, p0, Lt3/m;->a:Lq3/t;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lt3/m;->f:Lq3/x;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lt3/m;->e:Lq3/y;

    .line 13
    .line 14
    iget-object v2, p0, Lt3/m;->c:Lq3/j;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, Lq3/j;->d(Lq3/y;Lw3/a;)Lq3/x;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lt3/m;->f:Lq3/x;

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v1, p1, p2}, Lq3/x;->b(Lx3/c;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    if-nez p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Lx3/c;->q()Lx3/c;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iget-object p2, v0, Lw3/a;->b:Ljava/lang/reflect/Type;

    .line 33
    .line 34
    invoke-interface {v1}, Lq3/t;->a()Lq3/n;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    sget-object v0, Lt3/o;->A:Lt3/o$u;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2}, Lt3/o$u;->b(Lx3/c;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
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
