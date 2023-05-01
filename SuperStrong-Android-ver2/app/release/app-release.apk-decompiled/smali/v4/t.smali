.class public final Lv4/t;
.super Lv4/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/t$a;,
        Lv4/t$b;
    }
.end annotation


# static fields
.field public static final e:Lv4/s;

.field public static final f:Lv4/s;

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B


# instance fields
.field public final a:Lf5/h;

.field public final b:Lv4/s;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/t$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "multipart/mixed"

    invoke-static {v0}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    move-result-object v0

    sput-object v0, Lv4/t;->e:Lv4/s;

    const-string v0, "multipart/alternative"

    invoke-static {v0}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    const-string v0, "multipart/digest"

    invoke-static {v0}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    const-string v0, "multipart/parallel"

    invoke-static {v0}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    const-string v0, "multipart/form-data"

    invoke-static {v0}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    move-result-object v0

    sput-object v0, Lv4/t;->f:Lv4/s;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lv4/t;->g:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_1

    sput-object v1, Lv4/t;->h:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lv4/t;->i:[B

    return-void

    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Lf5/h;Lv4/s;Ljava/util/ArrayList;)V
    .locals 2

    invoke-direct {p0}, Lv4/a0;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lv4/t;->d:J

    iput-object p1, p0, Lv4/t;->a:Lf5/h;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lf5/h;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    move-result-object p1

    iput-object p1, p0, Lv4/t;->b:Lv4/s;

    invoke-static {p3}, Lw4/e;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lv4/t;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    iget-wide v0, p0, Lv4/t;->d:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lv4/t;->d(Lf5/f;Z)J

    move-result-wide v0

    iput-wide v0, p0, Lv4/t;->d:J

    return-wide v0
.end method

.method public final b()Lv4/s;
    .locals 1

    iget-object v0, p0, Lv4/t;->b:Lv4/s;

    return-object v0
.end method

.method public final c(Lf5/f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lv4/t;->d(Lf5/f;Z)J

    return-void
.end method

.method public final d(Lf5/f;Z)J
    .locals 16
    .param p1    # Lf5/f;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance v1, Lf5/e;

    .line 6
    .line 7
    invoke-direct {v1}, Lf5/e;-><init>()V

    .line 8
    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    move-object v2, v1

    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    :goto_0
    iget-object v3, v0, Lv4/t;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x0

    .line 23
    const-wide/16 v6, 0x0

    .line 24
    .line 25
    move v8, v5

    .line 26
    :goto_1
    iget-object v9, v0, Lv4/t;->a:Lf5/h;

    .line 27
    .line 28
    sget-object v10, Lv4/t;->i:[B

    .line 29
    .line 30
    sget-object v11, Lv4/t;->h:[B

    .line 31
    .line 32
    if-ge v8, v4, :cond_6

    .line 33
    .line 34
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    check-cast v12, Lv4/t$b;

    .line 39
    .line 40
    iget-object v13, v12, Lv4/t$b;->a:Lv4/p;

    .line 41
    .line 42
    invoke-interface {v1, v10}, Lf5/f;->write([B)Lf5/f;

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v9}, Lf5/f;->g(Lf5/h;)Lf5/f;

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v11}, Lf5/f;->write([B)Lf5/f;

    .line 49
    .line 50
    .line 51
    if-eqz v13, :cond_1

    .line 52
    .line 53
    iget-object v9, v13, Lv4/p;->a:[Ljava/lang/String;

    .line 54
    .line 55
    array-length v9, v9

    .line 56
    div-int/lit8 v9, v9, 0x2

    .line 57
    .line 58
    move v10, v5

    .line 59
    :goto_2
    if-ge v10, v9, :cond_1

    .line 60
    .line 61
    invoke-virtual {v13, v10}, Lv4/p;->d(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v14

    .line 65
    invoke-interface {v1, v14}, Lf5/f;->z(Ljava/lang/String;)Lf5/f;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    sget-object v15, Lv4/t;->g:[B

    .line 70
    .line 71
    invoke-interface {v14, v15}, Lf5/f;->write([B)Lf5/f;

    .line 72
    .line 73
    .line 74
    move-result-object v14

    .line 75
    invoke-virtual {v13, v10}, Lv4/p;->g(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v15

    .line 79
    invoke-interface {v14, v15}, Lf5/f;->z(Ljava/lang/String;)Lf5/f;

    .line 80
    .line 81
    .line 82
    move-result-object v14

    .line 83
    invoke-interface {v14, v11}, Lf5/f;->write([B)Lf5/f;

    .line 84
    .line 85
    .line 86
    add-int/lit8 v10, v10, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    iget-object v9, v12, Lv4/t$b;->b:Lv4/a0;

    .line 90
    .line 91
    invoke-virtual {v9}, Lv4/a0;->b()Lv4/s;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    if-eqz v10, :cond_2

    .line 96
    .line 97
    const-string v12, "Content-Type: "

    .line 98
    .line 99
    invoke-interface {v1, v12}, Lf5/f;->z(Ljava/lang/String;)Lf5/f;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    iget-object v10, v10, Lv4/s;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {v12, v10}, Lf5/f;->z(Ljava/lang/String;)Lf5/f;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    invoke-interface {v10, v11}, Lf5/f;->write([B)Lf5/f;

    .line 110
    .line 111
    .line 112
    :cond_2
    invoke-virtual {v9}, Lv4/a0;->a()J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    const-wide/16 v14, -0x1

    .line 117
    .line 118
    cmp-long v10, v12, v14

    .line 119
    .line 120
    if-eqz v10, :cond_3

    .line 121
    .line 122
    const-string v10, "Content-Length: "

    .line 123
    .line 124
    invoke-interface {v1, v10}, Lf5/f;->z(Ljava/lang/String;)Lf5/f;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-interface {v10, v12, v13}, Lf5/f;->A(J)Lf5/f;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-interface {v10, v11}, Lf5/f;->write([B)Lf5/f;

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    if-eqz p2, :cond_4

    .line 137
    .line 138
    invoke-virtual {v2}, Lf5/e;->c()V

    .line 139
    .line 140
    .line 141
    return-wide v14

    .line 142
    :cond_4
    :goto_3
    invoke-interface {v1, v11}, Lf5/f;->write([B)Lf5/f;

    .line 143
    .line 144
    .line 145
    if-eqz p2, :cond_5

    .line 146
    .line 147
    add-long/2addr v6, v12

    .line 148
    goto :goto_4

    .line 149
    :cond_5
    invoke-virtual {v9, v1}, Lv4/a0;->c(Lf5/f;)V

    .line 150
    .line 151
    .line 152
    :goto_4
    invoke-interface {v1, v11}, Lf5/f;->write([B)Lf5/f;

    .line 153
    .line 154
    .line 155
    add-int/lit8 v8, v8, 0x1

    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :cond_6
    invoke-interface {v1, v10}, Lf5/f;->write([B)Lf5/f;

    .line 160
    .line 161
    .line 162
    invoke-interface {v1, v9}, Lf5/f;->g(Lf5/h;)Lf5/f;

    .line 163
    .line 164
    .line 165
    invoke-interface {v1, v10}, Lf5/f;->write([B)Lf5/f;

    .line 166
    .line 167
    .line 168
    invoke-interface {v1, v11}, Lf5/f;->write([B)Lf5/f;

    .line 169
    .line 170
    .line 171
    if-eqz p2, :cond_7

    .line 172
    .line 173
    iget-wide v3, v2, Lf5/e;->c:J

    .line 174
    .line 175
    add-long/2addr v6, v3

    .line 176
    invoke-virtual {v2}, Lf5/e;->c()V

    .line 177
    .line 178
    .line 179
    :cond_7
    return-wide v6
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
