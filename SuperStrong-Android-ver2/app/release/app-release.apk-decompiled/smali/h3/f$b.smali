.class public final Lh3/f$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lh3/i;

.field public b:Lw2/a;

.field public c:Landroid/content/res/ColorStateList;

.field public d:Landroid/content/res/ColorStateList;

.field public final e:Landroid/content/res/ColorStateList;

.field public f:Landroid/content/res/ColorStateList;

.field public g:Landroid/graphics/PorterDuff$Mode;

.field public h:Landroid/graphics/Rect;

.field public final i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:F

.field public n:F

.field public final o:F

.field public final p:I

.field public q:I

.field public r:I

.field public s:I

.field public final t:Z

.field public final u:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(Lh3/f$b;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh3/f$b;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->f:Landroid/content/res/ColorStateList;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lh3/f$b;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lh3/f$b;->h:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lh3/f$b;->i:F

    iput v0, p0, Lh3/f$b;->j:F

    const/16 v0, 0xff

    iput v0, p0, Lh3/f$b;->l:I

    const/4 v0, 0x0

    iput v0, p0, Lh3/f$b;->m:F

    iput v0, p0, Lh3/f$b;->n:F

    iput v0, p0, Lh3/f$b;->o:F

    const/4 v0, 0x0

    iput v0, p0, Lh3/f$b;->p:I

    iput v0, p0, Lh3/f$b;->q:I

    iput v0, p0, Lh3/f$b;->r:I

    iput v0, p0, Lh3/f$b;->s:I

    iput-boolean v0, p0, Lh3/f$b;->t:Z

    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lh3/f$b;->u:Landroid/graphics/Paint$Style;

    iget-object v0, p1, Lh3/f$b;->a:Lh3/i;

    iput-object v0, p0, Lh3/f$b;->a:Lh3/i;

    iget-object v0, p1, Lh3/f$b;->b:Lw2/a;

    iput-object v0, p0, Lh3/f$b;->b:Lw2/a;

    iget v0, p1, Lh3/f$b;->k:F

    iput v0, p0, Lh3/f$b;->k:F

    iget-object v0, p1, Lh3/f$b;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->c:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lh3/f$b;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->d:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lh3/f$b;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lh3/f$b;->g:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p1, Lh3/f$b;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->f:Landroid/content/res/ColorStateList;

    iget v0, p1, Lh3/f$b;->l:I

    iput v0, p0, Lh3/f$b;->l:I

    iget v0, p1, Lh3/f$b;->i:F

    iput v0, p0, Lh3/f$b;->i:F

    iget v0, p1, Lh3/f$b;->r:I

    iput v0, p0, Lh3/f$b;->r:I

    iget v0, p1, Lh3/f$b;->p:I

    iput v0, p0, Lh3/f$b;->p:I

    iget-boolean v0, p1, Lh3/f$b;->t:Z

    iput-boolean v0, p0, Lh3/f$b;->t:Z

    iget v0, p1, Lh3/f$b;->j:F

    iput v0, p0, Lh3/f$b;->j:F

    iget v0, p1, Lh3/f$b;->m:F

    iput v0, p0, Lh3/f$b;->m:F

    iget v0, p1, Lh3/f$b;->n:F

    iput v0, p0, Lh3/f$b;->n:F

    iget v0, p1, Lh3/f$b;->o:F

    iput v0, p0, Lh3/f$b;->o:F

    iget v0, p1, Lh3/f$b;->q:I

    iput v0, p0, Lh3/f$b;->q:I

    iget v0, p1, Lh3/f$b;->s:I

    iput v0, p0, Lh3/f$b;->s:I

    iget-object v0, p1, Lh3/f$b;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->e:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lh3/f$b;->u:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lh3/f$b;->u:Landroid/graphics/Paint$Style;

    iget-object v0, p1, Lh3/f$b;->h:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    iget-object p1, p1, Lh3/f$b;->h:Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lh3/f$b;->h:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lh3/i;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh3/f$b;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lh3/f$b;->f:Landroid/content/res/ColorStateList;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lh3/f$b;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lh3/f$b;->h:Landroid/graphics/Rect;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lh3/f$b;->i:F

    iput v1, p0, Lh3/f$b;->j:F

    const/16 v1, 0xff

    iput v1, p0, Lh3/f$b;->l:I

    const/4 v1, 0x0

    iput v1, p0, Lh3/f$b;->m:F

    iput v1, p0, Lh3/f$b;->n:F

    iput v1, p0, Lh3/f$b;->o:F

    const/4 v1, 0x0

    iput v1, p0, Lh3/f$b;->p:I

    iput v1, p0, Lh3/f$b;->q:I

    iput v1, p0, Lh3/f$b;->r:I

    iput v1, p0, Lh3/f$b;->s:I

    iput-boolean v1, p0, Lh3/f$b;->t:Z

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v1, p0, Lh3/f$b;->u:Landroid/graphics/Paint$Style;

    iput-object p1, p0, Lh3/f$b;->a:Lh3/i;

    iput-object v0, p0, Lh3/f$b;->b:Lw2/a;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Lh3/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lh3/f;-><init>(Lh3/f$b;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lh3/f;->f:Z

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
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
.end method
