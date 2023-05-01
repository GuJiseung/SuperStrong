.class public final Lb1/g$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:Lb1/g$c;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Ll/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/b<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lb1/g$f;->p:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lb1/g$f;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, Lb1/g$f;->h:F

    iput v0, p0, Lb1/g$f;->i:F

    iput v0, p0, Lb1/g$f;->j:F

    iput v0, p0, Lb1/g$f;->k:F

    const/16 v0, 0xff

    iput v0, p0, Lb1/g$f;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, Lb1/g$f;->m:Ljava/lang/String;

    iput-object v0, p0, Lb1/g$f;->n:Ljava/lang/Boolean;

    new-instance v0, Ll/b;

    invoke-direct {v0}, Ll/b;-><init>()V

    iput-object v0, p0, Lb1/g$f;->o:Ll/b;

    new-instance v0, Lb1/g$c;

    invoke-direct {v0}, Lb1/g$c;-><init>()V

    iput-object v0, p0, Lb1/g$f;->g:Lb1/g$c;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lb1/g$f;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lb1/g$f;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Lb1/g$f;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lb1/g$f;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, Lb1/g$f;->h:F

    iput v0, p0, Lb1/g$f;->i:F

    iput v0, p0, Lb1/g$f;->j:F

    iput v0, p0, Lb1/g$f;->k:F

    const/16 v0, 0xff

    iput v0, p0, Lb1/g$f;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, Lb1/g$f;->m:Ljava/lang/String;

    iput-object v0, p0, Lb1/g$f;->n:Ljava/lang/Boolean;

    new-instance v0, Ll/b;

    invoke-direct {v0}, Ll/b;-><init>()V

    iput-object v0, p0, Lb1/g$f;->o:Ll/b;

    new-instance v1, Lb1/g$c;

    iget-object v2, p1, Lb1/g$f;->g:Lb1/g$c;

    invoke-direct {v1, v2, v0}, Lb1/g$c;-><init>(Lb1/g$c;Ll/b;)V

    iput-object v1, p0, Lb1/g$f;->g:Lb1/g$c;

    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Lb1/g$f;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Lb1/g$f;->a:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Lb1/g$f;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Lb1/g$f;->b:Landroid/graphics/Path;

    iget v1, p1, Lb1/g$f;->h:F

    iput v1, p0, Lb1/g$f;->h:F

    iget v1, p1, Lb1/g$f;->i:F

    iput v1, p0, Lb1/g$f;->i:F

    iget v1, p1, Lb1/g$f;->j:F

    iput v1, p0, Lb1/g$f;->j:F

    iget v1, p1, Lb1/g$f;->k:F

    iput v1, p0, Lb1/g$f;->k:F

    iget v1, p1, Lb1/g$f;->l:I

    iput v1, p0, Lb1/g$f;->l:I

    iget-object v1, p1, Lb1/g$f;->m:Ljava/lang/String;

    iput-object v1, p0, Lb1/g$f;->m:Ljava/lang/String;

    iget-object v1, p1, Lb1/g$f;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1, p0}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p1, Lb1/g$f;->n:Ljava/lang/Boolean;

    iput-object p1, p0, Lb1/g$f;->n:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(Lb1/g$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    iget-object v0, v7, Lb1/g$c;->a:Landroid/graphics/Matrix;

    .line 8
    .line 9
    move-object/from16 v1, p2

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    iget-object v9, v7, Lb1/g$c;->a:Landroid/graphics/Matrix;

    .line 15
    .line 16
    iget-object v0, v7, Lb1/g$c;->j:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {v9, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 22
    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    move v11, v10

    .line 26
    :goto_0
    iget-object v0, v7, Lb1/g$c;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ge v11, v1, :cond_1c

    .line 33
    .line 34
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lb1/g$d;

    .line 39
    .line 40
    instance-of v1, v0, Lb1/g$c;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    move-object v1, v0

    .line 45
    check-cast v1, Lb1/g$c;

    .line 46
    .line 47
    move-object/from16 v0, p0

    .line 48
    .line 49
    move-object v2, v9

    .line 50
    move-object/from16 v3, p3

    .line 51
    .line 52
    move/from16 v4, p4

    .line 53
    .line 54
    move/from16 v5, p5

    .line 55
    .line 56
    invoke-virtual/range {v0 .. v5}, Lb1/g$f;->a(Lb1/g$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_10

    .line 60
    .line 61
    :cond_0
    instance-of v1, v0, Lb1/g$e;

    .line 62
    .line 63
    if-eqz v1, :cond_1a

    .line 64
    .line 65
    check-cast v0, Lb1/g$e;

    .line 66
    .line 67
    move/from16 v1, p4

    .line 68
    .line 69
    int-to-float v2, v1

    .line 70
    iget v3, v6, Lb1/g$f;->j:F

    .line 71
    .line 72
    div-float/2addr v2, v3

    .line 73
    move/from16 v3, p5

    .line 74
    .line 75
    int-to-float v4, v3

    .line 76
    iget v5, v6, Lb1/g$f;->k:F

    .line 77
    .line 78
    div-float/2addr v4, v5

    .line 79
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    iget-object v12, v6, Lb1/g$f;->c:Landroid/graphics/Matrix;

    .line 84
    .line 85
    invoke-virtual {v12, v9}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v2, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 89
    .line 90
    .line 91
    const/4 v2, 0x4

    .line 92
    new-array v2, v2, [F

    .line 93
    .line 94
    fill-array-data v2, :array_0

    .line 95
    .line 96
    .line 97
    invoke-virtual {v9, v2}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 98
    .line 99
    .line 100
    aget v4, v2, v10

    .line 101
    .line 102
    float-to-double v13, v4

    .line 103
    const/4 v4, 0x1

    .line 104
    aget v15, v2, v4

    .line 105
    .line 106
    move/from16 p2, v5

    .line 107
    .line 108
    float-to-double v4, v15

    .line 109
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    .line 110
    .line 111
    .line 112
    move-result-wide v4

    .line 113
    double-to-float v4, v4

    .line 114
    const/4 v5, 0x2

    .line 115
    aget v13, v2, v5

    .line 116
    .line 117
    float-to-double v13, v13

    .line 118
    const/4 v15, 0x3

    .line 119
    aget v5, v2, v15

    .line 120
    .line 121
    move/from16 v17, v11

    .line 122
    .line 123
    float-to-double v10, v5

    .line 124
    invoke-static {v13, v14, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    .line 125
    .line 126
    .line 127
    move-result-wide v10

    .line 128
    double-to-float v5, v10

    .line 129
    const/4 v10, 0x0

    .line 130
    aget v11, v2, v10

    .line 131
    .line 132
    const/4 v10, 0x1

    .line 133
    aget v13, v2, v10

    .line 134
    .line 135
    const/4 v10, 0x2

    .line 136
    aget v10, v2, v10

    .line 137
    .line 138
    aget v2, v2, v15

    .line 139
    .line 140
    mul-float/2addr v11, v2

    .line 141
    mul-float/2addr v13, v10

    .line 142
    sub-float/2addr v11, v13

    .line 143
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    const/4 v4, 0x0

    .line 148
    cmpl-float v5, v2, v4

    .line 149
    .line 150
    if-lez v5, :cond_1

    .line 151
    .line 152
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    div-float/2addr v5, v2

    .line 157
    goto :goto_1

    .line 158
    :cond_1
    move v5, v4

    .line 159
    :goto_1
    cmpl-float v2, v5, v4

    .line 160
    .line 161
    if-nez v2, :cond_2

    .line 162
    .line 163
    goto/16 :goto_11

    .line 164
    .line 165
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v2, v6, Lb1/g$f;->a:Landroid/graphics/Path;

    .line 169
    .line 170
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 171
    .line 172
    .line 173
    iget-object v10, v0, Lb1/g$e;->a:[Ly/d$a;

    .line 174
    .line 175
    if-eqz v10, :cond_3

    .line 176
    .line 177
    invoke-static {v10, v2}, Ly/d$a;->b([Ly/d$a;Landroid/graphics/Path;)V

    .line 178
    .line 179
    .line 180
    :cond_3
    iget-object v10, v6, Lb1/g$f;->b:Landroid/graphics/Path;

    .line 181
    .line 182
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 183
    .line 184
    .line 185
    instance-of v11, v0, Lb1/g$a;

    .line 186
    .line 187
    if-eqz v11, :cond_5

    .line 188
    .line 189
    iget v0, v0, Lb1/g$e;->c:I

    .line 190
    .line 191
    if-nez v0, :cond_4

    .line 192
    .line 193
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_4
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 197
    .line 198
    :goto_2
    invoke-virtual {v10, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v2, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8, v10}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 205
    .line 206
    .line 207
    goto/16 :goto_11

    .line 208
    .line 209
    :cond_5
    check-cast v0, Lb1/g$b;

    .line 210
    .line 211
    iget v11, v0, Lb1/g$b;->j:F

    .line 212
    .line 213
    cmpl-float v13, v11, v4

    .line 214
    .line 215
    const/high16 v14, 0x3f800000    # 1.0f

    .line 216
    .line 217
    if-nez v13, :cond_6

    .line 218
    .line 219
    iget v13, v0, Lb1/g$b;->k:F

    .line 220
    .line 221
    cmpl-float v13, v13, v14

    .line 222
    .line 223
    if-eqz v13, :cond_9

    .line 224
    .line 225
    :cond_6
    iget v13, v0, Lb1/g$b;->l:F

    .line 226
    .line 227
    add-float/2addr v11, v13

    .line 228
    rem-float/2addr v11, v14

    .line 229
    iget v15, v0, Lb1/g$b;->k:F

    .line 230
    .line 231
    add-float/2addr v15, v13

    .line 232
    rem-float/2addr v15, v14

    .line 233
    iget-object v13, v6, Lb1/g$f;->f:Landroid/graphics/PathMeasure;

    .line 234
    .line 235
    if-nez v13, :cond_7

    .line 236
    .line 237
    new-instance v13, Landroid/graphics/PathMeasure;

    .line 238
    .line 239
    invoke-direct {v13}, Landroid/graphics/PathMeasure;-><init>()V

    .line 240
    .line 241
    .line 242
    iput-object v13, v6, Lb1/g$f;->f:Landroid/graphics/PathMeasure;

    .line 243
    .line 244
    :cond_7
    iget-object v13, v6, Lb1/g$f;->f:Landroid/graphics/PathMeasure;

    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    invoke-virtual {v13, v2, v14}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 248
    .line 249
    .line 250
    iget-object v13, v6, Lb1/g$f;->f:Landroid/graphics/PathMeasure;

    .line 251
    .line 252
    invoke-virtual {v13}, Landroid/graphics/PathMeasure;->getLength()F

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    mul-float/2addr v11, v13

    .line 257
    mul-float/2addr v15, v13

    .line 258
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 259
    .line 260
    .line 261
    cmpl-float v16, v11, v15

    .line 262
    .line 263
    if-lez v16, :cond_8

    .line 264
    .line 265
    iget-object v14, v6, Lb1/g$f;->f:Landroid/graphics/PathMeasure;

    .line 266
    .line 267
    const/4 v4, 0x1

    .line 268
    invoke-virtual {v14, v11, v13, v2, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 269
    .line 270
    .line 271
    iget-object v11, v6, Lb1/g$f;->f:Landroid/graphics/PathMeasure;

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    invoke-virtual {v11, v13, v15, v2, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 275
    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_8
    move v13, v4

    .line 279
    const/4 v4, 0x1

    .line 280
    iget-object v14, v6, Lb1/g$f;->f:Landroid/graphics/PathMeasure;

    .line 281
    .line 282
    invoke-virtual {v14, v11, v15, v2, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 283
    .line 284
    .line 285
    :goto_3
    invoke-virtual {v2, v13, v13}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 286
    .line 287
    .line 288
    :cond_9
    invoke-virtual {v10, v2, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 289
    .line 290
    .line 291
    iget-object v2, v0, Lb1/g$b;->g:Lx/c;

    .line 292
    .line 293
    iget-object v4, v2, Lx/c;->a:Landroid/graphics/Shader;

    .line 294
    .line 295
    if-eqz v4, :cond_a

    .line 296
    .line 297
    const/4 v4, 0x1

    .line 298
    goto :goto_4

    .line 299
    :cond_a
    const/4 v4, 0x0

    .line 300
    :goto_4
    if-nez v4, :cond_c

    .line 301
    .line 302
    iget v4, v2, Lx/c;->c:I

    .line 303
    .line 304
    if-eqz v4, :cond_b

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_b
    const/4 v4, 0x0

    .line 308
    goto :goto_6

    .line 309
    :cond_c
    :goto_5
    const/4 v4, 0x1

    .line 310
    :goto_6
    const/4 v13, 0x0

    .line 311
    const/high16 v14, 0x437f0000    # 255.0f

    .line 312
    .line 313
    const/16 v15, 0xff

    .line 314
    .line 315
    if-eqz v4, :cond_11

    .line 316
    .line 317
    iget-object v4, v6, Lb1/g$f;->e:Landroid/graphics/Paint;

    .line 318
    .line 319
    if-nez v4, :cond_d

    .line 320
    .line 321
    new-instance v4, Landroid/graphics/Paint;

    .line 322
    .line 323
    const/4 v11, 0x1

    .line 324
    invoke-direct {v4, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 325
    .line 326
    .line 327
    iput-object v4, v6, Lb1/g$f;->e:Landroid/graphics/Paint;

    .line 328
    .line 329
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 330
    .line 331
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 332
    .line 333
    .line 334
    :cond_d
    iget-object v4, v6, Lb1/g$f;->e:Landroid/graphics/Paint;

    .line 335
    .line 336
    iget-object v11, v2, Lx/c;->a:Landroid/graphics/Shader;

    .line 337
    .line 338
    if-eqz v11, :cond_e

    .line 339
    .line 340
    const/16 v18, 0x1

    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_e
    const/16 v18, 0x0

    .line 344
    .line 345
    :goto_7
    if-eqz v18, :cond_f

    .line 346
    .line 347
    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 351
    .line 352
    .line 353
    iget v2, v0, Lb1/g$b;->i:F

    .line 354
    .line 355
    mul-float/2addr v2, v14

    .line 356
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 361
    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_f
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 368
    .line 369
    .line 370
    iget v2, v2, Lx/c;->c:I

    .line 371
    .line 372
    iget v11, v0, Lb1/g$b;->i:F

    .line 373
    .line 374
    sget-object v18, Lb1/g;->k:Landroid/graphics/PorterDuff$Mode;

    .line 375
    .line 376
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 377
    .line 378
    .line 379
    move-result v15

    .line 380
    const v16, 0xffffff

    .line 381
    .line 382
    .line 383
    and-int v2, v2, v16

    .line 384
    .line 385
    int-to-float v15, v15

    .line 386
    mul-float/2addr v15, v11

    .line 387
    float-to-int v11, v15

    .line 388
    shl-int/lit8 v11, v11, 0x18

    .line 389
    .line 390
    or-int/2addr v2, v11

    .line 391
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 392
    .line 393
    .line 394
    :goto_8
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 395
    .line 396
    .line 397
    iget v2, v0, Lb1/g$e;->c:I

    .line 398
    .line 399
    if-nez v2, :cond_10

    .line 400
    .line 401
    sget-object v2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_10
    sget-object v2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 405
    .line 406
    :goto_9
    invoke-virtual {v10, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v8, v10, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 410
    .line 411
    .line 412
    :cond_11
    iget-object v2, v0, Lb1/g$b;->e:Lx/c;

    .line 413
    .line 414
    iget-object v4, v2, Lx/c;->a:Landroid/graphics/Shader;

    .line 415
    .line 416
    if-eqz v4, :cond_12

    .line 417
    .line 418
    const/4 v4, 0x1

    .line 419
    goto :goto_a

    .line 420
    :cond_12
    const/4 v4, 0x0

    .line 421
    :goto_a
    if-nez v4, :cond_14

    .line 422
    .line 423
    iget v4, v2, Lx/c;->c:I

    .line 424
    .line 425
    if-eqz v4, :cond_13

    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_13
    const/4 v4, 0x0

    .line 429
    goto :goto_c

    .line 430
    :cond_14
    :goto_b
    const/4 v4, 0x1

    .line 431
    :goto_c
    if-eqz v4, :cond_1b

    .line 432
    .line 433
    iget-object v4, v6, Lb1/g$f;->d:Landroid/graphics/Paint;

    .line 434
    .line 435
    if-nez v4, :cond_15

    .line 436
    .line 437
    new-instance v4, Landroid/graphics/Paint;

    .line 438
    .line 439
    const/4 v11, 0x1

    .line 440
    invoke-direct {v4, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 441
    .line 442
    .line 443
    iput-object v4, v6, Lb1/g$f;->d:Landroid/graphics/Paint;

    .line 444
    .line 445
    sget-object v15, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 446
    .line 447
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 448
    .line 449
    .line 450
    goto :goto_d

    .line 451
    :cond_15
    const/4 v11, 0x1

    .line 452
    :goto_d
    iget-object v4, v6, Lb1/g$f;->d:Landroid/graphics/Paint;

    .line 453
    .line 454
    iget-object v15, v0, Lb1/g$b;->n:Landroid/graphics/Paint$Join;

    .line 455
    .line 456
    if-eqz v15, :cond_16

    .line 457
    .line 458
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 459
    .line 460
    .line 461
    :cond_16
    iget-object v15, v0, Lb1/g$b;->m:Landroid/graphics/Paint$Cap;

    .line 462
    .line 463
    if-eqz v15, :cond_17

    .line 464
    .line 465
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 466
    .line 467
    .line 468
    :cond_17
    iget v15, v0, Lb1/g$b;->o:F

    .line 469
    .line 470
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 471
    .line 472
    .line 473
    iget-object v15, v2, Lx/c;->a:Landroid/graphics/Shader;

    .line 474
    .line 475
    if-eqz v15, :cond_18

    .line 476
    .line 477
    goto :goto_e

    .line 478
    :cond_18
    const/4 v11, 0x0

    .line 479
    :goto_e
    if-eqz v11, :cond_19

    .line 480
    .line 481
    invoke-virtual {v15, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 485
    .line 486
    .line 487
    iget v2, v0, Lb1/g$b;->h:F

    .line 488
    .line 489
    mul-float/2addr v2, v14

    .line 490
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 495
    .line 496
    .line 497
    goto :goto_f

    .line 498
    :cond_19
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 499
    .line 500
    .line 501
    const/16 v11, 0xff

    .line 502
    .line 503
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 504
    .line 505
    .line 506
    iget v2, v2, Lx/c;->c:I

    .line 507
    .line 508
    iget v11, v0, Lb1/g$b;->h:F

    .line 509
    .line 510
    sget-object v12, Lb1/g;->k:Landroid/graphics/PorterDuff$Mode;

    .line 511
    .line 512
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 513
    .line 514
    .line 515
    move-result v12

    .line 516
    const v14, 0xffffff

    .line 517
    .line 518
    .line 519
    and-int/2addr v2, v14

    .line 520
    int-to-float v12, v12

    .line 521
    mul-float/2addr v12, v11

    .line 522
    float-to-int v11, v12

    .line 523
    shl-int/lit8 v11, v11, 0x18

    .line 524
    .line 525
    or-int/2addr v2, v11

    .line 526
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 527
    .line 528
    .line 529
    :goto_f
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 530
    .line 531
    .line 532
    mul-float v5, v5, p2

    .line 533
    .line 534
    iget v0, v0, Lb1/g$b;->f:F

    .line 535
    .line 536
    mul-float/2addr v0, v5

    .line 537
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v8, v10, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 541
    .line 542
    .line 543
    goto :goto_11

    .line 544
    :cond_1a
    :goto_10
    move/from16 v1, p4

    .line 545
    .line 546
    move/from16 v3, p5

    .line 547
    .line 548
    move/from16 v17, v11

    .line 549
    .line 550
    :cond_1b
    :goto_11
    add-int/lit8 v11, v17, 0x1

    .line 551
    .line 552
    const/4 v10, 0x0

    .line 553
    goto/16 :goto_0

    .line 554
    .line 555
    :cond_1c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
.end method

.method public getAlpha()F
    .locals 2

    invoke-virtual {p0}, Lb1/g$f;->getRootAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    iget v0, p0, Lb1/g$f;->l:I

    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lb1/g$f;->setRootAlpha(I)V

    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    iput p1, p0, Lb1/g$f;->l:I

    return-void
.end method
