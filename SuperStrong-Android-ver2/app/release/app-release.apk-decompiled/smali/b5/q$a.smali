.class public final Lb5/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final b:Lf5/g;

.field public c:I

.field public d:B

.field public e:I

.field public f:I

.field public g:S


# direct methods
.method public constructor <init>(Lf5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/q$a;->b:Lf5/g;

    return-void
.end method


# virtual methods
.method public final B(Lf5/e;J)J
    .locals 7

    .line 1
    :goto_0
    iget p2, p0, Lb5/q$a;->f:I

    .line 2
    .line 3
    const-wide/16 v0, -0x1

    .line 4
    .line 5
    iget-object p3, p0, Lb5/q$a;->b:Lf5/g;

    .line 6
    .line 7
    if-nez p2, :cond_4

    .line 8
    .line 9
    iget-short p2, p0, Lb5/q$a;->g:S

    .line 10
    .line 11
    int-to-long v2, p2

    .line 12
    invoke-interface {p3, v2, v3}, Lf5/g;->skip(J)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    iput-short p2, p0, Lb5/q$a;->g:S

    .line 17
    .line 18
    iget-byte v2, p0, Lb5/q$a;->d:B

    .line 19
    .line 20
    and-int/lit8 v2, v2, 0x4

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    return-wide v0

    .line 25
    :cond_0
    iget v0, p0, Lb5/q$a;->e:I

    .line 26
    .line 27
    invoke-interface {p3}, Lf5/g;->readByte()B

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    and-int/lit16 v1, v1, 0xff

    .line 32
    .line 33
    shl-int/lit8 v1, v1, 0x10

    .line 34
    .line 35
    invoke-interface {p3}, Lf5/g;->readByte()B

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    and-int/lit16 v2, v2, 0xff

    .line 40
    .line 41
    shl-int/lit8 v2, v2, 0x8

    .line 42
    .line 43
    or-int/2addr v1, v2

    .line 44
    invoke-interface {p3}, Lf5/g;->readByte()B

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    and-int/lit16 v2, v2, 0xff

    .line 49
    .line 50
    or-int/2addr v1, v2

    .line 51
    iput v1, p0, Lb5/q$a;->f:I

    .line 52
    .line 53
    iput v1, p0, Lb5/q$a;->c:I

    .line 54
    .line 55
    invoke-interface {p3}, Lf5/g;->readByte()B

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    and-int/lit16 v1, v1, 0xff

    .line 60
    .line 61
    int-to-byte v1, v1

    .line 62
    invoke-interface {p3}, Lf5/g;->readByte()B

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    and-int/lit16 v2, v2, 0xff

    .line 67
    .line 68
    int-to-byte v2, v2

    .line 69
    iput-byte v2, p0, Lb5/q$a;->d:B

    .line 70
    .line 71
    sget-object v2, Lb5/q;->f:Ljava/util/logging/Logger;

    .line 72
    .line 73
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v4, 0x1

    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    iget v3, p0, Lb5/q$a;->e:I

    .line 83
    .line 84
    iget v5, p0, Lb5/q$a;->c:I

    .line 85
    .line 86
    iget-byte v6, p0, Lb5/q$a;->d:B

    .line 87
    .line 88
    invoke-static {v4, v3, v5, v1, v6}, Lb5/e;->a(ZIIBB)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-interface {p3}, Lf5/g;->readInt()I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    const v2, 0x7fffffff

    .line 100
    .line 101
    .line 102
    and-int/2addr p3, v2

    .line 103
    iput p3, p0, Lb5/q$a;->e:I

    .line 104
    .line 105
    const/16 v2, 0x9

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    if-ne v1, v2, :cond_3

    .line 109
    .line 110
    if-ne p3, v0, :cond_2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    const-string p1, "TYPE_CONTINUATION streamId changed"

    .line 114
    .line 115
    new-array p2, p2, [Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {p1, p2}, Lb5/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    throw v3

    .line 121
    :cond_3
    new-array p1, v4, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    aput-object p3, p1, p2

    .line 128
    .line 129
    const-string p2, "%s != TYPE_CONTINUATION"

    .line 130
    .line 131
    invoke-static {p2, p1}, Lb5/e;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    throw v3

    .line 135
    :cond_4
    int-to-long v2, p2

    .line 136
    const-wide/16 v4, 0x2000

    .line 137
    .line 138
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide v2

    .line 142
    invoke-interface {p3, p1, v2, v3}, Lf5/y;->B(Lf5/e;J)J

    .line 143
    .line 144
    .line 145
    move-result-wide p1

    .line 146
    cmp-long p3, p1, v0

    .line 147
    .line 148
    if-nez p3, :cond_5

    .line 149
    .line 150
    return-wide v0

    .line 151
    :cond_5
    iget p3, p0, Lb5/q$a;->f:I

    .line 152
    .line 153
    int-to-long v0, p3

    .line 154
    sub-long/2addr v0, p1

    .line 155
    long-to-int p3, v0

    .line 156
    iput p3, p0, Lb5/q$a;->f:I

    .line 157
    .line 158
    return-wide p1
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

.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lb5/q$a;->b:Lf5/g;

    invoke-interface {v0}, Lf5/y;->b()Lf5/z;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method
