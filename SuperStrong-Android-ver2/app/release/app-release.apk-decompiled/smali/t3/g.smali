.class public final Lt3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt3/g$a;
    }
.end annotation


# instance fields
.field public final b:Ls3/c;

.field public final c:Z


# direct methods
.method public constructor <init>(Ls3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/g;->b:Ls3/c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lt3/g;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lq3/j;Lw3/a;)Lq3/x;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq3/j;",
            "Lw3/a<",
            "TT;>;)",
            "Lq3/x<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lw3/a;->b:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    iget-object v1, p2, Lw3/a;->a:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Ljava/util/Map;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-static {v0}, Ls3/a;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    const-class v5, Ljava/util/Properties;

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    if-ne v0, v5, :cond_1

    .line 25
    .line 26
    new-array v0, v6, [Ljava/lang/reflect/Type;

    .line 27
    .line 28
    const-class v1, Ljava/lang/String;

    .line 29
    .line 30
    aput-object v1, v0, v3

    .line 31
    .line 32
    aput-object v1, v0, v4

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {v0, v1, v2}, Ls3/a;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-array v0, v6, [Ljava/lang/reflect/Type;

    .line 51
    .line 52
    const-class v1, Ljava/lang/Object;

    .line 53
    .line 54
    aput-object v1, v0, v3

    .line 55
    .line 56
    aput-object v1, v0, v4

    .line 57
    .line 58
    :goto_0
    aget-object v1, v0, v3

    .line 59
    .line 60
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-eq v1, v2, :cond_4

    .line 63
    .line 64
    const-class v2, Ljava/lang/Boolean;

    .line 65
    .line 66
    if-ne v1, v2, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    new-instance v2, Lw3/a;

    .line 70
    .line 71
    invoke-direct {v2, v1}, Lw3/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2}, Lq3/j;->c(Lw3/a;)Lq3/x;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_1
    sget-object v1, Lt3/o;->c:Lt3/o$y;

    .line 80
    .line 81
    :goto_2
    move-object v9, v1

    .line 82
    aget-object v1, v0, v4

    .line 83
    .line 84
    new-instance v2, Lw3/a;

    .line 85
    .line 86
    invoke-direct {v2, v1}, Lw3/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2}, Lq3/j;->c(Lw3/a;)Lq3/x;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    iget-object v1, p0, Lt3/g;->b:Ls3/c;

    .line 94
    .line 95
    invoke-virtual {v1, p2}, Ls3/c;->a(Lw3/a;)Ls3/n;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    new-instance p2, Lt3/g$a;

    .line 100
    .line 101
    aget-object v8, v0, v3

    .line 102
    .line 103
    aget-object v10, v0, v4

    .line 104
    .line 105
    move-object v5, p2

    .line 106
    move-object v6, p0

    .line 107
    move-object v7, p1

    .line 108
    invoke-direct/range {v5 .. v12}, Lt3/g$a;-><init>(Lt3/g;Lq3/j;Ljava/lang/reflect/Type;Lq3/x;Ljava/lang/reflect/Type;Lq3/x;Ls3/n;)V

    .line 109
    .line 110
    .line 111
    return-object p2
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
